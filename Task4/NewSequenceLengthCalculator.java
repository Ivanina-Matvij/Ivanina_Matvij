package Task4;

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
    public  int calculate(double alpha) {
        double radians = alpha * Math.PI / 180; // переводим угол в радианы
        double cos_alpha = Math.cos(radians); // вычисляем косинус угла
        double square = Math.pow(100 * cos_alpha, 2); // вычисляем квадрат
        double cube = Math.pow(100 * cos_alpha, 3); // вычисляем куб
        double sum = square + cube; // вычисляем сумму
        int rounded_sum = (int) Math.round(sum); // округляем до ближайшего целого
        String binary_sum = Integer.toBinaryString(rounded_sum); // переводим в двоичную систему счисления
        int max_sequence_length = getMaxSequenceLength(binary_sum); // находим наибольшую длину последовательности единиц
        return max_sequence_length;
    }

    public int calculate(int n, int m, int p) {
        return n * m + p;
    }

}
