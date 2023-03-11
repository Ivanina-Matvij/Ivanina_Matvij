package Task3;


public class SequenceLengthCalculatorFactory  {

    public static SequenceLengthCalculator createCalculator() {
        return new NewSequenceLengthCalculator();
    }
}
