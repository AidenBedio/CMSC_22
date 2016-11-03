
/**
 * Bedio, Aiden Justin
 * Malaki, Earl Timothy
 * Paler, Timothy River
 * BSCS | CMSC22
 * LAB 10 - Student DB
 */

public class Student {

    private String studentNumber;
    private int yearLevel;
    private String course;
    private String firstName;
    private char middleInitial;
    private String lastName;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {

        this.middleInitial = middleInitial;
    }

    public String toString(){
        return String.format("Student Number: %s\n" +
                "Name: %s, %s %s.\n" +
                "Program: %s\n" +
                "Year Level: %d", studentNumber, lastName, firstName, middleInitial, course, yearLevel);
    }

    public String toTextFile(){

        return String.format("%s\n" +
                "%s\n%s\n%s\n" +
                "%s\n" +
                "%d\n", studentNumber, firstName, middleInitial, lastName, course, yearLevel);
    }
}