package Task5;

public class NewSequenceLengthCalculator implements SequenceLengthCalculator {
    public static int getMaxSequenceLength(String binaryString) {
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }
        return maxLength;
    }

    @Override
    public int calculate(int n, int m, int p) {
        double alpha = (double) (n + m + p) / (n * m * p);
        double radians = alpha * Math.PI / 180;
        double cos_alpha = Math.cos(radians);
        double square = Math.pow(100 * cos_alpha, 2);
        double cube = Math.pow(100 * cos_alpha, 3);
        double sum = square + cube;
        int rounded_sum = (int) Math.round(sum);
        String binary_sum = Integer.toBinaryString(rounded_sum);
        int max_sequence_length = getMaxSequenceLength(binary_sum);
        return max_sequence_length;
    }

    @Override
    public int calculate(double alpha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculate'");
    }
}

