////////////////////////////////////////////////////////////////////////////////Bedio Programming(c)///////////////////////////
//////////////////////////////////////////////////////////////////////////////////11/3/16//////////////////////////////////////

import java.io.Serializable;

public class Student implements Serializable{

    private String studentNumber;
    private int yearLevel;
    private String course;
    private String firstName;
    private char middleInitial;
    private String lastName;
    private String crushName;
    private Course faveSubject = new Course();


    public String getCourse() {
        return course;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    public Course getFaveSubject() {
        return faveSubject;
    }
    
    public void setCourseCode(String courseCode) {
        faveSubject.setCourseCode(courseCode);
    }
    
    public void setCourseDescription(String courseDescription) {
        faveSubject.setCourseDescription(courseDescription);
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
                "Year Level: %d\n" +
                "Crush Name: %s\n" +
                faveSubject, studentNumber, lastName, firstName, middleInitial, course, yearLevel, crushName);
    }
    
    public String toString(boolean a){
        
    String newLine = System.getProperty("line.separator");
        return String.format("%s\n" + newLine +
                "%s\n%s\n%s\n" + newLine +
                "%s\n" + newLine +
                "%d" + newLine, studentNumber, lastName, firstName, middleInitial, course, yearLevel);
    }
}
