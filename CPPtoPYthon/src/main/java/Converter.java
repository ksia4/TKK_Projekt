import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


import java.io.BufferedWriter;
import java.io.IOException;

public class Converter {
    public void convert(String cppCode, BufferedWriter w) throws IOException {
        CommonTokenStream tok =  generateTokkens(cppCode);

        System.out.println("zrobiono tokeny");

        CPPGramaParser parser = new CPPGramaParser(tok);
        System.out.println("Stworzono parser");
        ParseTree parseTree = parser.unitToTranslate();
        System.out.println("Przeparsowano");
        generatePythonCode(w, parseTree, 1024);
    }

    private  CommonTokenStream generateTokkens(String cppCode){
        CharStream cs = new ANTLRInputStream(cppCode);
        CPPGramaLexer l = new CPPGramaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(l);
        return tokens;
    }

    private void generatePythonCode(BufferedWriter writer, ParseTree tree, int size) {
        CppGramaListenerImpl listenerr =  new CppGramaListenerImpl(writer, size);
        ParseTreeWalker w = new ParseTreeWalker();
        w.walk(listenerr, tree);
    }
}
