package Task5;


public class SequenceLengthCalculatorFactory  {

    public static SequenceLengthCalculator createCalculator() {
        return new NewSequenceLengthCalculator();
    }
}
