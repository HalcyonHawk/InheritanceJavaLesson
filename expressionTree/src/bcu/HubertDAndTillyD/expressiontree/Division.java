package bcu.HubertDAndTillyD.expressiontree;
//Pair programming with Hubert Dudowicz and Tilly Davies
public class Division extends BinaryOperation {

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate(double a, double b) {
        return a / b;
    }

    @Override
    String getSymbol() {
        return "/";
    }
}
