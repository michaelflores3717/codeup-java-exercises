package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);

        System.out.println("What would you like to do?");
        System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category");
        System.out.println("Enter your choice");

        int userInput = input.getInt();
        if (userInput == 0) {
            System.exit(0);
        } else {
            movieReturnMethod(userInput);
        }
    }

    public static void movieReturnMethod (int userInput) {
        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner);
        Movie[] listOfMovies =  MoviesArray.findAll();
        do {
            if (userInput == 1) {
                for (Movie movie : listOfMovies) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
            else if (userInput == 2) {
                for (Movie movie : listOfMovies) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName() + " - " + movie.getCategory());
                    }
                }
            }
            else if (userInput == 3) {
                for (Movie movie : listOfMovies) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName() + " - " + movie.getCategory());
                    }
                }
            }
            else if (userInput == 4) {
                for (Movie movie : listOfMovies) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName() + " - " + movie.getCategory());
                    }
                }
            }
            else if (userInput == 5) {
                for (Movie movie : listOfMovies) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName() + " - " + movie.getCategory());
                    }
                }
            }
            System.out.println("What would you like to do?");
            System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category");
            System.out.println("Enter your choice");
            userInput = input.getInt();
        } while (userInput != 0);
    }
}
