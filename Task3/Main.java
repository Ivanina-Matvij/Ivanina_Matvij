package Task3;

public class Main {
    public static void main(String[] args) {
        double alpha = 45; // угол в градусах
        SequenceLengthCalculator calculator = SequenceLengthCalculatorFactory.createCalculator();
        int max_sequence_length = calculator.calculate(alpha);
        System.out.println("Максимальна довжина одиниць: " + max_sequence_length);

        ReadObject.serialize(max_sequence_length, "code.ser");
    }
}

