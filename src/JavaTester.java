import grades.Student;

public class JavaTester {
    public static void main(String[] args) {
        Student student = new Student("bob");
        student.addGrade(90);
        student.addGrade(95);
        student.addGrade(100);

        System.out.println(student.getGradeAverage());
    }
}
