package Task2;

public class Main {
    public static void main(String[] args) {
        double alpha = 45; // угол в градусах
        int max_sequence_length = WriteObject.calculate(alpha);
        System.out.println("Максимальна довжина одиниць: " + max_sequence_length);

        ReadObject.serialize(max_sequence_length, "code.ser");
    }
}

