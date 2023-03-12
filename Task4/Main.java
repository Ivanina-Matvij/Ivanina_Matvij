package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.print("Enter m: ");
        int m = scanner.nextInt();

        System.out.print("Enter p: ");
        int p = scanner.nextInt();

        SequenceLengthCalculator calculator = new NewSequenceLengthCalculator();
        int result = calculator.calculate(n, m, p);

        System.out.println("Result: " + result);
    }
}


