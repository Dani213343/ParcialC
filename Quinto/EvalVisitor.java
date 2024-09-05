import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public class EvalVisitor extends TrigFunctionsBaseVisitor<Double> {

    @Override
    public Double visitSin(TrigFunctionsParser.SinContext ctx) {
        double angle = Double.parseDouble(ctx.NUMBER().getText());
        return Math.sin(Math.toRadians(angle));
    }

    @Override
    public Double visitCos(TrigFunctionsParser.CosContext ctx) {
        double angle = Double.parseDouble(ctx.NUMBER().getText());
        return Math.cos(Math.toRadians(angle));
    }

    @Override
    public Double visitTan(TrigFunctionsParser.TanContext ctx) {
        double angle = Double.parseDouble(ctx.NUMBER().getText());
        return Math.tan(Math.toRadians(angle));
    }
}
