import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person personOne = new Person("Bob");
        Person personTwo = new Person("Mike");
        Person personThree = new Person("Jerry");

        Person[] persons = new Person[3];

        persons[0] = personOne;
        persons[1] = personTwo;
        persons[2] =  personThree;

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName());
        }

    }
}
