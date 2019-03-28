import java.util.Scanner;

public class HighLow {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
//  int userNumber = scan.nextInt();
        HighLow();

    }

    public static int randomNumber() {
        return (int)(Math.random()* 100) +1;
    }

    public static int userNumber() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int userNumber = scan.nextInt();
        scan.nextLine();
        return userNumber;
    }

    public static void HighLow() {
        System.out.println("Guess a number between 1 and 100.");
        int number = randomNumber();
        int user;
        do {
            user = userNumber();
            if(user < number){
                System.out.println("Too Low.");
            } else if(user > number){
                System.out.println("Too High.");
            } else if (user == number) {
                System.out.println("You got it");
                break;
            }
        } while(user > number || user < number);
    }

}