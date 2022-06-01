package Node;

import java.util.ArrayList;
import java.util.List;

public class ProgramCNode extends Node {
    public List<StatementNode> statements = new ArrayList<>();
    public List<FunctionCNode> functions = new ArrayList<>();
}
