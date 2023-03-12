package Task5;

public class BaseSequenceLengthCalculator implements SequenceLengthCalculator {
    @Override
    public int calculate(int n, int m, int p) {
        int product = n * m * p;
        int result = 0;
        while (product > 0) {
            int digit = product % 10;
            result += digit;
            product /= 10;
        }
        return result;
    }

    @Override
    public int calculate(double alpha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculate'");
    }
}


