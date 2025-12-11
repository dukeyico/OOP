package StudentGradesTrackerUsingClasses;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grades Tracker!");

        // loop to create and populate student objects
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter Student Details " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Grade: ");
            char grade = scanner.next().charAt(0);
            scanner.nextLine();

            students[i] = new Student(name, grade);
        }

        System.out.println("Student Details: ");
        for (Student student : students) {
            System.out.println(student.getDetails());
        }

    }
}
