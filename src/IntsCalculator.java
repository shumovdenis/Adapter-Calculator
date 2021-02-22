public class IntsCalculator implements Ints{
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();
        formula.addOperand(arg0).addOperand(arg1);
        formula.calculate(Calculator.Operation.SUM);
        return (int) formula.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = target.newFormula();
        formula.addOperand(arg0).addOperand(arg1);
        formula.calculate(Calculator.Operation.MULT);
        return (int) formula.result();
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula formula = target.newFormula();
        formula.addOperand(a).addOperand(b);
        formula.calculate(Calculator.Operation.POW);
        return (int) formula.result();
    }
}
