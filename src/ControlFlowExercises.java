import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 5;
        while (number < 15) {
            number++;
            System.out.println(number);
        }

        int doWhileNumber = 100;

        do {
            doWhileNumber -= 5;
            System.out.println(doWhileNumber);
        } while (doWhileNumber > -10);

        long secondDoWhileNumber = 2;

        do {
            System.out.println(secondDoWhileNumber);
            secondDoWhileNumber *= secondDoWhileNumber;
        } while (secondDoWhileNumber < 1000000);

        for (int i = 0; i <= 50; i++) {
            if(i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("Enter an integer");
        int userInteger = scanner.nextInt();

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 0; i <= userInteger; i++) {
            System.out.printf(" %d     | %d       | %d     \n", i, (i*i), (i*i*i));
        }

        System.out.println("Enter a grade.");
        int userGradeInt = scanner.nextInt();

        String userContinues;

        do {
            if (userGradeInt <= 100 && userGradeInt >= 88) {
                System.out.println("You got an A.");
            } else if (userGradeInt <= 87 && userGradeInt >= 80) {
                System.out.println("You got a B.");
            } else if (userGradeInt <= 79 && userGradeInt >= 67) {
                System.out.println("You got a C.");
            } else if (userGradeInt <= 66 && userGradeInt >= 60) {
                System.out.println("You got a D.");
            } else {
                System.out.println("You failed.");
            }
            System.out.println("Do you want to enter another grade?");
            userContinues = scanner.next();
            System.out.println("Enter a grade.");
            userGradeInt = scanner.nextInt();
        } while (userContinues.equals("y"));
    }
}
