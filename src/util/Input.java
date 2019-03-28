package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        String userResponse = scanner.next();
        if (userResponse.equalsIgnoreCase("y") || (userResponse.equalsIgnoreCase("yes"))) {
            return true;
        }
        else return false;
    }

    public int getInt(int min, int max) {
        int userInput = scanner.nextInt();
        while (userInput < min || userInput > max) {
            System.out.println("Enter a number between the max and min");
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public int getInt() {
        int userInput = scanner.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max) {
        double userInput = scanner.nextInt();
        while (userInput < min || userInput > max) {
            System.out.println("Enter a number between the max and min");
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public double getDouble() {
        double userInput = scanner.nextInt();
        return userInput;
    }
}

