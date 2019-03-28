import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println("Please enter an integer between 1 and 10.");
        int userInput = getInteger(1, 10);
        System.out.println("Good job. " + userInput + " is between 1 and 10.");

    }

    public static int addition(int numOne, int numTwo) {
        int sum = numOne + numTwo;
        return sum;
    }

    public static int subtraction(int numOne, int numTwo) {
        int remainder = numOne - numTwo;
        return remainder;
    }

    public static int multiplication(int numOne, int numTwo) {
        int product = numOne * numTwo;
        return product;
    }

    public static int division(int numOne, int numTwo) {
        int remainder = numOne / numTwo;
        return remainder;
    }

    public static int modulus(int numOne, int numTwo) {
        int remainder = numOne % numTwo;
        return remainder;
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        while ((userInput < min) || (userInput > max)) {
            System.out.println("That's not an integer between 1 and 10. Try again.");
            userInput = scanner.nextInt();
        }
        return userInput;
    }

    public static void getFactorial() {
        String continueResponse;
        Scanner scanner = new Scanner(System.in);
        long returnVar = 1;
        do {
            System.out.println("Enter a number between 1 and 10.");
            int userInput = scanner.nextInt();
            if (userInput <= 10 && userInput >= 0)
                for (long i = 1; i <= userInput; i++) {
                    returnVar *= i;
                }
            else {
                System.out.println("Try again");
                getFactorial();
            }
            System.out.println(returnVar);
            System.out.println("Do you want to continue?");
            continueResponse = scanner.next();
        } while (continueResponse.equals("yes"));
    }

    public static void diceRoller() {
        Scanner scanner = new Scanner(System.in);
        String userResponse;
        do {
            System.out.println("Enter the number of sides of a dice.");
            int diceSides = scanner.nextInt();
            int random = getRandomIntegerBetweenRange(1, diceSides);
            System.out.println(random);
            userResponse = scanner.next();
        } while(userResponse.equals("yes"));
    }

    public static int getRandomIntegerBetweenRange(int min, int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}






