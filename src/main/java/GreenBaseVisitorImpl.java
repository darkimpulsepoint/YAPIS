import Node.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GreenBaseVisitorImpl extends GreenBaseVisitor<Node> {
    public final Map<String, String> globals = new HashMap<>();
    public boolean foreach = false;
    public ProgramCNode main = new ProgramCNode();
    FileWriter writer;
    public final StringBuilder cPlusPlusCode = new StringBuilder("");

    public GreenBaseVisitorImpl(String filename) throws IOException {
        writer = new FileWriter(filename, false);
    }

    @Override
    public Node visitProgram(GreenParser.ProgramContext ctx) {
        cPlusPlusCode.append("#include <iostream>\n#include <vector>\n");
        GreenParser.SubprogramContext sctx = ctx.subprogram();
        ProgramCNode programNode = new ProgramCNode();
        programNode.functions = ctx.func()
                .stream()
                .map(this::visitFunc)
                .collect(Collectors.toList());
        cPlusPlusCode.append("int main(){\n");
        programNode.statements = visitSubprogram(sctx).statements;
        cPlusPlusCode.append("system(\"pause\");");
        cPlusPlusCode.append("\n}\n");
        this.main = programNode;
        try {
            writer.append(cPlusPlusCode);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this.main;
    }

    @Override
    public SubprogramNode visitSubprogram(GreenParser.SubprogramContext ctx) {

        var subprogramNode = new SubprogramNode();

        subprogramNode.statements = ctx.statement()
                .stream()
                .map(this::visitStatement)
                .collect(Collectors.toList());
        if (ctx.RETURN().getText().length() > 6)
            subprogramNode.returnValue = ctx.RETURN().getText(); //.split(" ")[1];
        return subprogramNode;
    }

    @Override
    public StatementNode visitStatement(GreenParser.StatementContext ctx) {
        StatementNode statementNode = null;
        if (ctx.block() != null) {
            statementNode = visitBlock(ctx.block());
        } else if (ctx.io() != null) {
            statementNode = visitIo(ctx.io());
        } else if (ctx.var_define() != null) {
            statementNode = visitVar_define(ctx.var_define());
        } else if (ctx.landing_expression() != null) {
            statementNode = visitLanding_expression(ctx.landing_expression());
        } else if (ctx.var_action() != null) {
            statementNode = visitVar_action(ctx.var_action());
        } else if (ctx.func_call() != null) {
            statementNode = visitFunc_call(ctx.func_call());
        } else if (ctx.operations_with_list() != null) {
            statementNode = visitOperations_with_list(ctx.operations_with_list());
        }
        return statementNode;
    }

    @Override
    public FuncCallNode visitOperations_with_list(GreenParser.Operations_with_listContext ctx) {
        if (ctx.ADD() != null) {
            cPlusPlusCode.append(ctx.ID(0) + ctx.DOT().getText() + "push_back(" + ctx.ID(1) + ");\n");
        } else if (ctx.DELETE() != null) {
            if (ctx.ADD() != null) {
                cPlusPlusCode.append(ctx.ID(0) + ctx.DOT().getText() + "remove(" + ctx.ID(1) + ");\n");
            }
        }
        return new FuncCallNode();
    }

    @Override
    public BlockNode visitBlock(GreenParser.BlockContext ctx) {
        BlockNode blockNode = new BlockNode();
        if (ctx.for_block() != null) {
            blockNode = visitFor_block(ctx.for_block());
        } else if (ctx.if_block() != null) {
            blockNode = visitIf_block(ctx.if_block());
        }
        if(!foreach) {
            cPlusPlusCode.append("\n{\n");
        }
        blockNode.statements = ctx.statement()
                .stream()
                .map(this::visitStatement)
                .collect(Collectors.toList());
        cPlusPlusCode.append("}\n");
        foreach = false;
        return blockNode;
    }

    public ForBlockNode visitForEach_block(GreenParser.For_blockContext ctx) {
        ForBlockNode forBlockNode = new ForBlockNode();
        cPlusPlusCode.append("for(int _ii = 0;");
        forBlockNode.fromParam = "_ii";
        cPlusPlusCode.append(forBlockNode.fromParam + "<");
        if (ctx.ID(1) != null) {
            forBlockNode.toParam = ctx.ID(1).getText();
        } else if (ctx.NUM() != null) {
            forBlockNode.toParam = ctx.NUM().getText();
        }
        cPlusPlusCode.append(forBlockNode.toParam + ".size()" + ";" + forBlockNode.fromParam + "++)\n");
        cPlusPlusCode.append("{\n");
        cPlusPlusCode.append(ctx.ID(0).getText()+"=" +ctx.ID(1)+ "[" + forBlockNode.fromParam +"]" + ";\n");
        foreach = true;
        return new ForBlockNode();
    }

    @Override
    public ForBlockNode visitFor_block(GreenParser.For_blockContext ctx) {
        if (ctx.ID() != null && ctx.ID(1) != null) {
            if (globals.get(ctx.ID(1).getText()).equals("[list]")) {
                return visitForEach_block(ctx);
            }
        }
        ForBlockNode forBlockNode = new ForBlockNode();
        cPlusPlusCode.append("for(;");
        forBlockNode.fromParam = ctx.ID(0).getText();
        cPlusPlusCode.append(forBlockNode.fromParam + "<");
        if (ctx.ID(1) != null) {
            forBlockNode.toParam = ctx.ID(1).getText();
        } else if (ctx.NUM() != null) {
            forBlockNode.toParam = ctx.NUM().getText();
        }
        cPlusPlusCode.append(forBlockNode.toParam + ";" + forBlockNode.fromParam + "++)\n");
        if (!globals.containsKey(forBlockNode.toParam)) {
            System.out.println("Переменная в range не объявлена:" + forBlockNode.toParam);
        }
        return forBlockNode;
    }

    @Override
    public IfBlockNode visitIf_block(GreenParser.If_blockContext ctx) {
        IfBlockNode ifBlockNode = new IfBlockNode();
        cPlusPlusCode.append("if(");
        ifBlockNode.firstExp = visitMath_expression(ctx.math_expression(0));
        cPlusPlusCode.append(ifBlockNode.firstExp.toString());
        ifBlockNode.secondExp = visitMath_expression(ctx.math_expression(1));
        ifBlockNode.compareOp = ctx.COMPARE_OP().getText();
        if (ifBlockNode.compareOp.equals("<>")) {
            cPlusPlusCode.append("!=");
        } else
            cPlusPlusCode.append(ifBlockNode.compareOp);
        cPlusPlusCode.append(ifBlockNode.secondExp.toString());
        cPlusPlusCode.append(")\n");
        return new IfBlockNode();
    }

    @Override
    public MathExpressionNode visitMath_expression(GreenParser.Math_expressionContext ctx) {
        MathExpressionNode mathExpressionNode = null;
        if (ctx.typeCast() != null) {
            mathExpressionNode = visitTypeCast(ctx.typeCast());
        } else if (ctx.inBrackets() != null) {
            mathExpressionNode = visitInBrackets(ctx.inBrackets());
        } else if (ctx.math_expression(0) != null) {
            MathOperationNode mathOperationNode = new MathOperationNode();
            mathOperationNode.firstExp = visitMath_expression(ctx.math_expression(0));
            mathOperationNode.secondExp = visitMath_expression(ctx.math_expression(1));
            mathOperationNode.op = ctx.OP().getText();
            mathExpressionNode = mathOperationNode;
        } else if (ctx.have_value() != null) {
            mathExpressionNode = visitHave_value(ctx.have_value());
        }
        return mathExpressionNode;
    }

    @Override
    public TypeCastNode visitTypeCast(GreenParser.TypeCastContext ctx) {
        TypeCastNode typeCastNode = new TypeCastNode();
        typeCastNode.type = ctx.TYPE().getText();
        typeCastNode.mathExpression = visitMath_expression(ctx.math_expression());
        return typeCastNode;
    }

    @Override
    public InBracketsNode visitInBrackets(GreenParser.InBracketsContext ctx) {
        InBracketsNode inBracketsNode = new InBracketsNode();
        inBracketsNode.mathExpression = visitMath_expression(ctx.math_expression());
        return inBracketsNode;
    }

    @Override
    public HaveValueNode visitHave_value(GreenParser.Have_valueContext ctx) {
        HaveValueNode haveValueNode = new HaveValueNode();
        if (ctx.ID() != null) {
            haveValueNode.param = ctx.ID().getText();
            if (!globals.containsKey(haveValueNode.param)) {
                System.out.println("Переменная не объявлена:" + haveValueNode.param);
            }
        } else if (ctx.NUM() != null) {
            haveValueNode.param = ctx.NUM().getText();
        }
        return haveValueNode;
    }

    @Override
    public IoCNode visitIo(GreenParser.IoContext ctx) {
        IoCNode ioNode = new IoCNode();
        ioNode.operator = ctx.STREAM_OP().getText();
        ioNode.mathExpression = visitMath_expression(ctx.math_expression());
        cPlusPlusCode.append(ioNode.toString()+"\n");
        return ioNode;
    }

    @Override
    public VarDefineCNode visitVar_define(GreenParser.Var_defineContext ctx) {
        VarDefineCNode varDefineNode = new VarDefineCNode();
        if (ctx.math_expression() == null) {
            varDefineNode.type = "[list]";
        } else {
            varDefineNode.type = "[int]";
        }
        varDefineNode.id = ctx.ID().getText();
        if (ctx.ASSIG() != null) {
            if (ctx.math_expression() != null) {
                varDefineNode.expression = visitMath_expression(ctx.math_expression());
            } else if (ctx.list_special_define() != null) {
                varDefineNode.expression = visitList_special_define(ctx.list_special_define());
            }
        }
        String append = varDefineNode.toString();
        if (globals.containsKey(varDefineNode.id)) {
            if (!globals.get(varDefineNode.id).equals(varDefineNode.type)) {
                System.out.println("Переменная объявлена несколько раз:" + varDefineNode.id);
            } else {
                cPlusPlusCode.append(varDefineNode.toString().substring(4)+"\n");
                append = append.substring(4);
            }
        } else {
            globals.put(varDefineNode.id, varDefineNode.type);
        }
        cPlusPlusCode.append(append+"\n");
        return varDefineNode;
    }

    @Override
    public ListSpecialDefineNode visitList_special_define(GreenParser.List_special_defineContext ctx) {
        ListSpecialDefineNode listSpecialDefineNode = new ListSpecialDefineNode();
        for (TerminalNode n : ctx.NUM()) {
            listSpecialDefineNode.numbers.add(n.getText());
        }
        return listSpecialDefineNode;
    }

    @Override
    public LandingExpressionNode visitLanding_expression(GreenParser.Landing_expressionContext ctx) {
        LandingExpressionNode landingExpressionNode = new LandingExpressionNode();
        landingExpressionNode.id = ctx.ID().getText();
        landingExpressionNode.op = ctx.OP().getText();
        landingExpressionNode.mathExpression = visitMath_expression(ctx.math_expression());
        cPlusPlusCode.append(landingExpressionNode.toString()+"\n");
        return landingExpressionNode;
    }

    @Override
    public VarActionNode visitVar_action(GreenParser.Var_actionContext ctx) {
        VarActionNode varActionNode = null;
        if (ctx.binary_expression() != null) {
            varActionNode = visitBinary_expression(ctx.binary_expression());
        } else if (ctx.var_reform() != null) {
            varActionNode = visitVar_reform(ctx.var_reform());
        }
        varActionNode.id = ctx.ID().getText();
        if (!globals.containsKey(varActionNode.id)) {
            System.out.println("Переменная не объявлена:" + varActionNode.id);
        }
        return varActionNode;
    }

    @Override
    public BinaryExpressionNode visitBinary_expression(GreenParser.Binary_expressionContext ctx) {
        BinaryExpressionNode binaryExpressionNode = new BinaryExpressionNode();
        binaryExpressionNode.op = ctx.BINARY_OP().getText();
        binaryExpressionNode.mathExpression = visitMath_expression(ctx.math_expression());
        return binaryExpressionNode;
    }

    @Override
    public VarReformNode visitVar_reform(GreenParser.Var_reformContext ctx) {
        VarReformNode varReformNode = new VarReformNode();
        varReformNode.mathExpression = visitMath_expression(ctx.math_expression());
        return varReformNode;
    }

    @Override
    public FuncCallNode visitFunc_call(GreenParser.Func_callContext ctx) {
        FuncCallNode funcCallNode = new FuncCallNode();
        funcCallNode.id = ctx.ID().getText();

        if (!globals.containsKey(funcCallNode.id)) {
            System.out.println("Функция не объявлена:" + funcCallNode.id);
        }
        funcCallNode.params = ctx.math_expression()
                .stream()
                .map(this::visitMath_expression)
                .collect(Collectors.toList());
        cPlusPlusCode.append(funcCallNode.toString()+"\n");
        return funcCallNode;
    }

    @Override
    public FunctionCNode visitFunc(GreenParser.FuncContext ctx) {
        FunctionCNode functionNode = new FunctionCNode();
        functionNode.type = ctx.PARAM(0).getText().split(" ")[0];
        functionNode.id = ctx.PARAM(0).getText().split(" ")[1];
        for (int i = 1; i < ctx.PARAM().size(); i++) {
            ParamNode paramNode = new ParamNode(ctx.PARAM(i).getText());
            functionNode.params.add(paramNode);
            globals.put(paramNode.id, paramNode.type);
        }
        if (globals.containsKey(functionNode.id)) {
            System.out.println("Функция объявлена несколько раз:" + functionNode.id);
        } else
            globals.put(functionNode.id, functionNode.type);
        cPlusPlusCode.append(functionNode.toString()+"\n");
        cPlusPlusCode.append("\n{\n");
        GreenParser.SubprogramContext sctx = ctx.subprogram();
        SubprogramNode subprogram = visitSubprogram(sctx);
        functionNode.statements = subprogram.statements;
        functionNode.returnValue = subprogram.returnValue;
        if (functionNode.returnValue != null) {
            if (!globals.get(functionNode.returnValue).equals(functionNode.type)) {
                System.out.println("Возвращаемое значение не соответсвует типу функции:" + functionNode.type);
            }
        } else if (!functionNode.type.equals("[]")) {
            System.out.println("Функция не должна возвращать значение:" + functionNode.id);
        }
        if (!functionNode.type.equals("[]")) {
            cPlusPlusCode.append("return " + functionNode.returnValue + ";\n");
        }
        cPlusPlusCode.append("}\n");
        return functionNode;
    }
}
