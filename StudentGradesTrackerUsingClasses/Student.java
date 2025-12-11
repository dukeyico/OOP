package StudentGradesTrackerUsingClasses;

public class Student {
    private String studentName;
    private char studentGrade;

    public Student (String studentName, char studentGrade) {
        this.studentName = studentName;
        this.studentGrade = studentGrade;
    }

    public String getDetails() {
        return "Student Name: " + studentName + ", Student Grade: " + studentGrade;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentGrade(char studentGrade) {
        this.studentGrade = studentGrade;
    }
    public String getStudentName() {
        return studentName;
    }
    public char getStudentGrade() {
        return studentGrade;
    }
}
