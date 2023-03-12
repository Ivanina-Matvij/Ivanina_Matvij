package Task5;

public class CalculationCommand implements Command {
    private final SequenceLengthCalculator calculator;
    private final int n;
    private final int m;
    private final int p;
    private int result;

    public CalculationCommand(int p, int n, int m, SequenceLengthCalculator calculator) {
        this.calculator = calculator;
        this.n = n;
        this.m = m;
        this.p = p;
    }

    @Override
    public void execute() {
        result = calculator.calculate(n, m, p);
        System.out.println("Result: " + result);
    }

    @Override
    public void undo() {
        System.out.println("Undoing calculation command");
        result = 0;
    }

    public int getResult() {
        return result;
    }
}
