package Lab1.Problem4;

import Practice2.Student;
import java.util.ArrayList;

public class GradeBook {

    private Course course;
    private ArrayList<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }

    public GradeBook(Course course, ArrayList<Student> students) {
        this.course = course;
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
    }

    // Calculations

    public double determineClassAverage() {
        if (students.isEmpty()) {
            return 0;
        }

        double sum = 0;
        for(Student s : students) {
            sum += s.getGrade();
        }
        return sum / students.size();
    }

    public ArrayList<Student> getBestStudent() {
        if (students.isEmpty()) {
            return null;
        }
        ArrayList<Student> bestGradesStudents = new ArrayList<>();

        Student best = students.get(0);
        for(Student student : students) {
            if(student.getGrade() > best.getGrade()) {
                best = student;
            }
        }

        for(Student student : students) {
            if(student.getGrade() == best.getGrade()) {
                bestGradesStudents.add(student);
            }
        }
        return bestGradesStudents;
    }

    public ArrayList<Student> getWorstStudent() {
        if (students.isEmpty()) {
            return null;
        }
        ArrayList<Student> worstGradesStudents = new ArrayList<>();

        Student worst = students.get(0);
        for(Student student : students) {
            if(student.getGrade() < worst.getGrade()) {
                worst = student;
            }
        }

        for(Student student : students) {
            if(student.getGrade() == worst.getGrade()) {
                worstGradesStudents.add(student);
            }
        }
        return worstGradesStudents;
    }


    // Statistics

    public void outputBarChart() {
        int[] freq = new int[11];

        for (Student s : students) {
            int g = (int) s.getGrade();
            if (g == 100) freq[10]++;
            else freq[g / 10]++;
        }

        System.out.println("Grades distribution:");
        for (int i = 0; i < 10; i++) {
            int start = i * 10;
            int end = i * 10 + 9;
            System.out.printf("%02d-%02d: ", start, end);
            printStars(freq[i]);
        }
        System.out.print("100: ");
        printStars(freq[10]);
    }

    private void printStars(int count) {
        for (int i = 0; i < count; i++) System.out.print("*");
        System.out.println();
    }

    public void displayGradeReport() {
//        displayMessage();
        System.out.println("Class average: " + determineClassAverage());

        ArrayList<Student> best = getBestStudent();
        ArrayList<Student> worst = getWorstStudent();

        if (best != null) {
            System.out.println("Highest grade: " + best);
        }
        if (worst != null) {
            System.out.println("Lowest grade: " + worst);
        }

        outputBarChart();
    }
}
