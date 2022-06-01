package Node;

public class IoCNode extends StatementNode {
    public String operator;
    public MathExpressionNode mathExpression;
    public String toString(){
        String ioString = "";
        if (operator.contains("o")){
            ioString += "std::cout <<("+mathExpression.toString()+") << std::endl;";
        }else if (operator.contains("i")) {
            ioString += "std::cin >>" + mathExpression.toString() +";";
        }
        return ioString;
    }
}
