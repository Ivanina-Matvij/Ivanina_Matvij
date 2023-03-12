package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandProcessor processor = new CommandProcessor();
        boolean running = true;

        while (running) {
            System.out.println("Enter a command (calculate n m p, undo, exit):");
            String input = scanner.nextLine();

            String[] commandParts = input.split(" ");
            String command = commandParts[0];

            switch (command) {
                case "calculate":
                    if (commandParts.length != 4) {
                        System.out.println("Invalid command syntax. Usage: calculate n m p");
                        break;
                    }

                    int n = Integer.parseInt(commandParts[1]);
                    int m = Integer.parseInt(commandParts[2]);
                    int p = Integer.parseInt(commandParts[3]);

                    int result = processor.calculate(n, m, p);
                    System.out.println("Result: " + result);
                    break;

                case "undo":
                    processor.undo();
                    System.out.println("Undo performed.");
                    break;

                case "exit":
                    running = false;
                    break;

                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }

        scanner.close();
    }
}



