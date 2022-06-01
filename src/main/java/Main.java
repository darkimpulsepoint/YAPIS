import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static final String COMPILE_CPP_FILE = "g++ result.cpp -o out.exe";
    public static final String RUN_EXE_FILE = "out.bat";

    public static void main(String[] args) throws IOException, InterruptedException {
        CharStream codePointCharStream = CharStreams.fromFileName("src/main/resources/test.txt");
        GreenLexer lexer = new GreenLexer(codePointCharStream);
        GreenParser parser = new GreenParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        GreenBaseVisitorImpl visitor = new GreenBaseVisitorImpl("result.cpp");
        visitor.visit(tree);
        runExeFile();
        System.out.println("end");
    }

    private static void runExeFile() throws IOException {
        Runtime.getRuntime().exec(COMPILE_CPP_FILE);
        Runtime.getRuntime().exec(RUN_EXE_FILE);
    }

    private static Thread getThread(String exec) {
        return new Thread(() -> {
            try {
                Process process = Runtime.getRuntime().exec(exec);
                process.waitFor();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
//"src/main/resources/test.txt"
