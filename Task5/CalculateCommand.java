package Task5;

public class CalculateCommand implements Command {
    private final SequenceLengthCalculator calculator;
    private final int n, m, p;
    private int result;

    public CalculateCommand(SequenceLengthCalculator calculator, int n, int m, int p) {
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
        System.out.println("Undoing calculation...");
    }
    
    public int getResult() {
        return result;
    }
}

