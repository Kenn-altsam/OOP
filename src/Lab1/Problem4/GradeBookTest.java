package Lab1.Problem4;

import java.util.ArrayList;
import java.util.Scanner;
import Practice2.Student;

public class GradeBookTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> prerequisites = new ArrayList<>();
        prerequisites.add("PP1");



        Course course = new Course("CS101", "Object Oriendted Programming", 5, prerequisites);

        GradeBook gradeBook = new GradeBook(course);

        gradeBook.displayMessage();

        System.out.print("How many students are in the course: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i);

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Year of study: ");
            int year = scanner.nextInt();

            System.out.print("Grade (0-100): ");
            int grade = scanner.nextInt();

            Student student = new Student(name, id, year, grade);
            gradeBook.addStudent(student);
        }
        System.out.println();
        gradeBook.displayGradeReport();

        scanner.close();
    }
}
