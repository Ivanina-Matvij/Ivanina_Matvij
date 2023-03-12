package Task5;

import java.util.Stack;

public class CommandProcessor {
    private SequenceLengthCalculator calculator;
    private Stack<Command> commandStack;

    public CommandProcessor() {
        calculator = new NewSequenceLengthCalculator();
        commandStack = new Stack<>();
    }

    public int calculate(int n, int m, int p) {
        int result = calculator.calculate(n, m, p);
        commandStack.push(new CalculationCommand(n, m, p, calculator));
        return result;
    }

    public void undo() {
        if (!commandStack.isEmpty()) {
            Command lastCommand = commandStack.pop();
            lastCommand.undo();
        }
    }
}


