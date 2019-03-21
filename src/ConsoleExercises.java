import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;

        System.out.format("%s", pi);

        System.out.println("\nEnter an integer: ");

        int userInput = scanner.nextInt();

        System.out.println(userInput);

        System.out.println("\nEnter three new words: ");

        String wordOne = scanner.next();

        String wordTwo = scanner.next();

        String wordThree = scanner.next();

        scanner.nextLine();

        System.out.format("%s %s %s\n", wordOne, wordTwo, wordThree);

        System.out.println("\nEnter a sentence: ");

        String userSentence = scanner.nextLine();

        System.out.println(userSentence);

        System.out.println("\nProvide the width of the CodeUp Classroom: ");

        String width = scanner.nextLine();

        System.out.println("\nProvide the length of the CodeUp Classroom: ");

        String length = scanner.nextLine();

        int widthInt = Integer.parseInt(width);
        int lengthInt = Integer.parseInt(length);

        System.out.println("\nArea is: " + (widthInt * lengthInt));

        System.out.println("Perimeter is: " + ((widthInt * 2) + (lengthInt * 2)));
    }
}
