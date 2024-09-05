grammar TrigFunctions;

@header {
import java.util.*;
import java.io.*;
}

@members {
    public static void main(String[] args) throws Exception {
        // Read from file
        CharStream input = CharStreams.fromFileName("expr.in");
        TrigFunctionsLexer lexer = new TrigFunctionsLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TrigFunctionsParser parser = new TrigFunctionsParser(tokens);
        ParseTree tree = parser.expr(); // parse the input
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}

expr: (sin | cos | tan) EOF;

sin: 'Sin' '(' NUMBER ')';
cos: 'Cos' '(' NUMBER ')';
tan: 'Tan' '(' NUMBER ')';

NUMBER: [0-9]+;
WS: [ \t\n\r]+ -> skip;
