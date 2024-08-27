package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.type.*;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.item.*;
import main.visitor.Visitor;

import java.util.*;

public class TypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    public Stack<Set<Type>> stack = new Stack<Set<Type>>();
    @Override
    public Type visit(Program program){
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
            }catch (ItemAlreadyExists ignored){}
        }
        for(PatternDeclaration patternDeclaration : program.getPatternDeclarations()){
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try{
                SymbolTable.root.put(patternItem);
            }catch (ItemAlreadyExists ignored){}
        }
        program.getMain().accept(this);

        return null;
    }
    @Override
    public Type visit(FunctionDeclaration functionDeclaration){
        SymbolTable.push(new SymbolTable());
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());
            ArrayList<Type> currentArgTypes = functionItem.getArgumentTypes();
            for (int i = 0; i < functionDeclaration.getArgs().size(); i++) {
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                if(i < currentArgTypes.size()){
                    argItem.setType(currentArgTypes.get(i));
                }
                else{
                    argItem.setType(functionDeclaration.getArgs().get(i).getDefaultVal().accept(this));
                }
                try {
                    SymbolTable.top.put(argItem);
                }catch (ItemAlreadyExists ignored){}
            }
        }catch (ItemNotFound ignored){}

        stack.push(new HashSet<Type> ());
        for(Statement statement : functionDeclaration.getBody())
            statement.accept(this);

        Set <Type> S = stack.pop();
        SymbolTable.pop();
        if(S.isEmpty()) {
            return new NoType();
        }
        if(S.size() > 1){
            typeErrors.add(new FunctionIncompatibleReturnTypes(functionDeclaration.getLine(), functionDeclaration.getFunctionName().getName()));
            return new NoType();
        }
        Iterator <Type> it = S.iterator();
        return it.next();
    }
    @Override
    public Type visit(PatternDeclaration patternDeclaration){
        SymbolTable.push(new SymbolTable());
        Set<Type> S = new HashSet<Type> ();
        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    patternDeclaration.getPatternName().getName());
            VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
            varItem.setType(patternItem.getTargetVarType());
            try {
                SymbolTable.top.put(varItem);
            }catch (ItemAlreadyExists ignored){}
            for(Expression expression : patternDeclaration.getConditions()){
                Type cur = expression.accept(this);
                if(!(cur instanceof BoolType) && !(cur instanceof NoType)){
                    typeErrors.add(new ConditionIsNotBool(expression.getLine()));
                    SymbolTable.pop();
                    return new NoType();
                }
            }
            for(Expression exp : patternDeclaration.getReturnExp()){
                Type cur = exp.accept(this);
                if(!(cur instanceof NoType)){
                    S.add(cur);
                }
            }
        }catch (ItemNotFound ignored){}


        SymbolTable.pop();
        Type returnType = new NoType();
        if(S.size() > 1){
            typeErrors.add(new PatternIncompatibleReturnTypes(patternDeclaration.getLine(), patternDeclaration.getPatternName().getName()));
            return returnType;
        } else if (S.size() == 0) {
            return returnType;
        }
        Iterator <Type> it = S.iterator();
        returnType = it.next();
        return returnType;
    }
    @Override
    public Type visit(MainDeclaration mainDeclaration){
        for(Statement statement : mainDeclaration.getBody()) {
            statement.accept(this);
        }
        return new NoType();
    }
    @Override
    public Type visit(AccessExpression accessExpression){
        if(accessExpression.isFunctionCall()){
            accessExpression.getAccessedExpression().accept(this);
            ArrayList<Type> currentArgTypes = new ArrayList<Type>();
            for(Expression exp : accessExpression.getArguments()){
                currentArgTypes.add(exp.accept(this));
            }
            Identifier id = (Identifier) accessExpression.getAccessedExpression();

            try{
                FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        id.getName());
                functionItem.setArgumentTypes(currentArgTypes);

                return functionItem.getFunctionDeclaration().accept(this);
            }catch (ItemNotFound ignored){}
        }
        else{
            Type accessedType = accessExpression.getAccessedExpression().accept(this);
            if(!(accessedType instanceof ListType) && !(accessedType instanceof StringType) && !(accessedType instanceof NoType)){
                typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
                return new NoType();
            }
            for(Expression exp : accessExpression.getDimentionalAccess()) {
                Type curExp = exp.accept(this);
                if (!(curExp instanceof IntType) && !(accessedType instanceof NoType)) {
                    typeErrors.add(new AccessIndexIsNotInt(accessExpression.getLine()));
                    return new NoType();
                }
            }
            if(accessedType instanceof ListType){
                ListType lt = (ListType) accessedType;
                return lt.getType();
            }
            return accessedType;
        }
        return null;
    }

    @Override
    public Type visit(ReturnStatement returnStatement){
        Type returnType = returnStatement.getReturnExp().accept(this);
        Set<Type> S = stack.peek();
        if(!(returnType instanceof NoType)){
            S.add(returnType);
        }
        return returnType;
    }
    @Override
    public Type visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }
    @Override
    public Type visit(ForStatement forStatement){
        SymbolTable.push(SymbolTable.top.copy());
        VarItem varItem = new VarItem(forStatement.getIteratorId());
        forStatement.getIteratorId().accept(this);
        varItem.setType(forStatement.getRangeExpression().accept(this));
        try{
            SymbolTable.top.put(varItem);
        }catch (ItemAlreadyExists ignored){}

        for(Statement statement : forStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(IfStatement ifStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Expression expression : ifStatement.getConditions()) {
            Type cur = expression.accept(this);
            if (!(cur instanceof BoolType) && !(cur instanceof NoType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
        }
        for(Statement statement : ifStatement.getThenBody())
            statement.accept(this);
        for(Statement statement : ifStatement.getElseBody())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(LoopDoStatement loopDoStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Statement statement : loopDoStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(AssignStatement assignStatement){
        if(assignStatement.isAccessList()){
            Identifier Iden = assignStatement.getAssignedId();
            assignStatement.getAssignedId().accept(this);
            Type ty = assignStatement.getAssignExpression().accept(this);
            try{
                VarItem lt = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + Iden.getName());
                if(!(lt.getType().sameType(ty)) && !(ty instanceof NoType)){
                    typeErrors.add(new ListElementsTypesMisMatch(assignStatement.getLine()));
                }
            }catch (ItemNotFound ignored){}
        }
        else{
            assignStatement.getAssignedId().accept(this);
            VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
            newVarItem.setType(assignStatement.getAssignExpression().accept(this));
            try {
                SymbolTable.top.put(newVarItem);
            }catch (ItemAlreadyExists retyping){
                try{
                    VarItem cur = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + assignStatement.getAssignedId().getName());
                    cur.setType(newVarItem.getType());
                }
                catch (ItemNotFound impossible){}
            }
        }
        return new NoType();
    }
    @Override
    public Type visit(BreakStatement breakStatement){
        for(Expression expression : breakStatement.getConditions()){
            Type cur = expression.accept(this);
            if (!(cur instanceof BoolType) && !(cur instanceof NoType)) {
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
            }
        }
        return new NoType();
    }
    @Override
    public Type visit(NextStatement nextStatement){
        for(Expression expression : nextStatement.getConditions()) {
            Type cur = expression.accept(this);
            if (!(cur instanceof BoolType) && !(cur instanceof NoType)) {
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
            }
        }
        return new NoType();
    }
    @Override
    public Type visit(PushStatement pushStatement){
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return new NoType();
    }
    @Override
    public Type visit(PutStatement putStatement){
        putStatement.getExpression().accept(this);
        return new NoType();
    }
    @Override
    public Type visit(BoolValue boolValue){
        return new BoolType();
    }
    @Override
    public Type visit(IntValue intValue){
        return new IntType();
    }
    @Override
    public Type visit(FloatValue floatValue){
        return new FloatType();
    }
    @Override
    public Type visit(StringValue stringValue){
        return new StringType();
    }
    @Override
    public Type visit(ListValue listValue){
        Set<Type> S = new HashSet<Type> ();

        for(Expression exp : listValue.getElements()){
            Type cur = exp.accept(this);
            if(!(cur instanceof NoType)) {
                S.add(cur);
            }
        }

        ListType ret = new ListType(new NoType());
        if(S.size() > 1){
            typeErrors.add(new ListElementsTypesMisMatch(listValue.getLine()));
            return new NoType();
        } else if (S.size() == 1) {
            Iterator<Type> it = S.iterator();
            ret.setType(it.next());
        }
        return ret;
    }
    @Override
    public Type visit(FunctionPointer functionPointer){
        return new FptrType(functionPointer.getId().getName());
    }
    @Override
    public Type visit(AppendExpression appendExpression){
        Type appendeeType = appendExpression.getAppendee().accept(this);
        if(!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType) && !(appendeeType instanceof NoType)){
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        }
        Set <Type> S = new HashSet<Type>();
        if(appendeeType instanceof ListType){
            if(!(((ListType) appendeeType).getType() instanceof NoType)){
                S.add(((ListType) appendeeType).getType());
            }
        } else if (!(appendeeType instanceof NoType)){
            S.add(appendeeType);
        }
        for(Expression exp : appendExpression.getAppendeds()){
            Type cur = exp.accept(this);
            if(cur instanceof ListType){
                typeErrors.add(new AppendTypesMisMatch(appendExpression.getLine()));
                return new NoType();
            }
            if(!(cur instanceof NoType)){
                S.add(cur);
            }
        }
        if(S.size() > 1){
            typeErrors.add(new AppendTypesMisMatch(appendExpression.getLine()));
            return new NoType();
        }
        if(appendeeType instanceof ListType){
            return ((ListType) appendeeType).getType();
        }
        return appendeeType;
    }
    @Override
    public Type visit(BinaryExpression binaryExpression){
        Type A = binaryExpression.getFirstOperand().accept(this);
        Type B = binaryExpression.getSecondOperand().accept(this);

        if(A instanceof NoType){
            Type C = B;
            B = A;
            A = C;
        }

        if(!(A.sameType(B)) && !(B instanceof NoType)){
            typeErrors.add(new NonSameOperands(binaryExpression.getLine(), binaryExpression.getOperator()));
            return new NoType();
        }
        if(A instanceof ListType){
            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getOperator().toString()));
            return new NoType();
        }

        if(A instanceof StringType){
            if(!(binaryExpression.getOperator().equals(BinaryOperator.EQUAL)) && !(binaryExpression.getOperator().equals(BinaryOperator.NOT_EQUAL))){
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getOperator().toString()));
                return new NoType();
            }
        } else if (A instanceof BoolType) {
            if(!(binaryExpression.getOperator().equals(BinaryOperator.EQUAL)) && !(binaryExpression.getOperator().equals(BinaryOperator.NOT_EQUAL))){
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), binaryExpression.getOperator().toString()));
                return new NoType();
            }
        }
        if(binaryExpression.getOperator().equals(BinaryOperator.DIVIDE) || binaryExpression.getOperator().equals(BinaryOperator.MINUS)){
            return A;
        }
        if(binaryExpression.getOperator().equals(BinaryOperator.PLUS) || binaryExpression.getOperator().equals(BinaryOperator.MULT)){
            return A;
        }
        return new BoolType();
    }
    @Override
    public Type visit(UnaryExpression unaryExpression){
        Type returnType = unaryExpression.getExpression().accept(this);
        if(returnType instanceof StringType || returnType instanceof ListType){
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().toString()));
            return new NoType();
        }
        if(returnType instanceof BoolType){
            if(!(unaryExpression.getOperator().equals(UnaryOperator.NOT))){
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), unaryExpression.getOperator().toString()));
                return new NoType();
            }
        }
        return returnType;
    }
    @Override
    public Type visit(ChompStatement chompStatement){
        Type ret = chompStatement.getChompExpression().accept(this);
        if (!(ret instanceof StringType) && !(ret instanceof NoType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chompStatement.getLine()));
            return new NoType();
        }

        return new StringType();
    }
    @Override
    public Type visit(ChopStatement chopStatement){
        Type ret = chopStatement.getChopExpression().accept(this);
        if (!(ret instanceof StringType) && !(ret instanceof NoType)) {
            typeErrors.add(new ChopArgumentTypeMisMatch(chopStatement.getLine()));
            return new NoType();
        }
        return new StringType();
    }
    @Override
    public Type visit(Identifier identifier){
        try{
            VarItem lt = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + identifier.getName());
            return lt.getType();
        }catch (ItemNotFound ignored){}

        return new NoType();
    }
    @Override
    public Type visit(LenStatement lenStatement){
        Type expType = lenStatement.getExpression().accept(this);
        if((!(expType instanceof StringType)) && (!(expType instanceof ListType)) && (!(expType instanceof NoType))){
            typeErrors.add(new LenArgumentTypeMisMatch(lenStatement.getLine()));
            return new NoType();
        }
        return new IntType();
    }
    @Override
    public Type visit(MatchPatternStatement matchPatternStatement){
        try{
            PatternItem patternItem = (PatternItem)SymbolTable.root.getItem(PatternItem.START_KEY +
                    matchPatternStatement.getPatternId().getName());
            patternItem.setTargetVarType(matchPatternStatement.getMatchArgument().accept(this));
            return patternItem.getPatternDeclaration().accept(this);
        }catch (ItemNotFound ignored){}
        return new NoType();
    }
    @Override
    public Type visit(RangeExpression rangeExpression){
        RangeType rangeType = rangeExpression.getRangeType();

        if(rangeType.equals(RangeType.LIST)){
            Set <Type> S = new HashSet<Type>();
            for(Expression exp : rangeExpression.getRangeExpressions()){
                Type cur = exp.accept(this);
                if(!(cur instanceof NoType)){
                    S.add(cur);
                }
            }
            if(S.size() > 1){
                typeErrors.add(new ListElementsTypesMisMatch(rangeExpression.getLine()));
                return new NoType();
            }
            Iterator <Type> it = S.iterator();
            return it.next();
        } else if (rangeType.equals(RangeType.DOUBLE_DOT)) {
            for(Expression exp : rangeExpression.getRangeExpressions()){
                Type cur = exp.accept(this);
                if(!(cur instanceof IntType) && !(cur instanceof NoType)){
                    typeErrors.add(new RangeValuesMisMatch(rangeExpression.getLine()));
                    return new NoType();
                }
            }
            return new IntType();
        } else {
            for(Expression exp : rangeExpression.getRangeExpressions()){
                Type expType = exp.accept(this);
                if(expType instanceof ListType){
                    return ((ListType) expType).getType();
                } else if (expType instanceof NoType) {
                    return expType;
                }
                typeErrors.add(new IsNotIterable(rangeExpression.getLine()));
                return new NoType();
            }
        }
        return new NoType();
    }
}