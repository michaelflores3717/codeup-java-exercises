package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    private static HashMap<String, Student> students;

    public GradesApplication() {
        students = new HashMap<>();
    }

    public void addStudent (String username, Student student) {
        students.put(username, student);
    }

    public static void main(String[] args) {
        Student student = new Student("bob");
        student.addGrade(90);
        student.addGrade(95);
        student.addGrade(100);

        Student studentTwo = new Student("billy");
        studentTwo.addGrade(81);
        studentTwo.addGrade(83);
        studentTwo.addGrade(89);

        Student studentThree = new Student("charlie");
        studentThree.addGrade(75);
        studentThree.addGrade(71);
        studentThree.addGrade(79);

        GradesApplication gradesApplication = new GradesApplication();
        gradesApplication.addStudent("bobthebob", student);
        gradesApplication.addStudent("billythebilly", studentTwo);
        gradesApplication.addStudent("charliethecharlie", studentThree);

        mainApp();
    }

    public static void mainApp() {
        Scanner scanner = new Scanner(System.in);
        String userResponse;
        do {
            boolean studentFound = false;
            System.out.println("What student would you like more info on?");
            for (String key : students.keySet()) {
                System.out.println(key);
            }
            String userChoice = scanner.next();
            scanner.nextLine();
            for (String key : students.keySet()) {
                if (userChoice.equals(key)) {
                    Student student = students.get(key);
                    System.out.println("Username: " + key);
                    System.out.println("grades.Student name: " + student.getName());
                    System.out.println("Grade average: " + student.getGradeAverage());
                    studentFound = true;
                }
            }
            if (!studentFound) {
                System.out.println("grades.Student not found.");
            }
            System.out.println("Would you like to view another student? (y/n)");
            userResponse = scanner.next();
        } while (userResponse.equals("y"));
    }
}
