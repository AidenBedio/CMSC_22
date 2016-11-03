import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Bedio, Aiden Justin
 * Malaki, Earl Timothy
 * Paler, Timothy River
 * BSCS | CMSC22
 * LAB 10 - Student DB
 */

public class StudentTest{

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Scanner scan = new Scanner(System.in);

        List<Student> studentList = new LinkedList<Student>();
        Student student = null;
        File file = null;
        int choice;

        try {
            file = new File("studDB.txt");
            if (!file.exists()) {       // file doesn't exist, make a new file
                file.createNewFile();
            }
            else{   // else fetch data
                System.out.println("Im here");
                studentList = fetchDataFromFile(file);
                System.out.println("done");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



        while (true){

            System.out.println("\tMenu\n" +
                    "\t\t1.] Register\n" +
                    "\t\t2.] Retrieve \n" +
                    "\t\t3.] Delete\n" +
                    "\t\t4.] Update\n" +
                    "\t\t5.] Save\n" +
                    "\t\t9.] Exit\n");
            System.out.print("Enter: ");
            choice = scan.nextInt();

            switch (choice){

                case 1:         // add
                    student = new Student();
                    studentList.add(addStudent(student, studentList));
                    break;

                case 2:         // retrieve
                    retrieve(studentList);
                    break;

                case 3:         // delete
                    studentList = delete(studentList);
                    break;

                case 4:         // update
                    update(studentList);
                    break;

                case 5:         // save
                    save(studentList, file);
                    break;

                case 9:         // exit
                    System.exit(0);
                    break;

                default:        // clear screen
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    break;
            }

        }

    }

    public static List<Student> fetchDataFromFile(File file) throws IOException, ClassNotFoundException{
        
        List<Student> studentList = new LinkedList<>();
        
        if (file.length() != 0){
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
  
            studentList = (List) ois.readObject();           
        }
        
        return studentList;
    }

    public static Student addStudent(Student student, List<Student> studentList){

        Scanner scan = new Scanner(System.in);
        boolean validStudNum;
        String studentNumber = null;


        do {
            validStudNum = true;

            System.out.print("Enter Student Number: ");
            studentNumber = scan.nextLine();

            for(Student currStudent: studentList){
                if (currStudent.getStudentNumber().equals(studentNumber)){   // if student is found
                    System.out.println("Student Number already exists! Enter a unique student number.");
                    validStudNum = false;
                    break;
                }
            }
        }while (!validStudNum);

            student.setStudentNumber(studentNumber);
            System.out.print("Enter Year Level: ");
            student.setYearLevel(scan.nextInt());
            scan.nextLine();
            System.out.print("Enter Course: ");
            student.setCourse(scan.nextLine());
            System.out.print("Enter First Name: ");
            student.setFirstName(scan.nextLine());
            System.out.print("Enter Middle Initial: ");
            student.setMiddleInitial((scan.nextLine().charAt(0)));
            System.out.print("Enter Last Name: ");
            student.setLastName(scan.nextLine());
            System.out.print("Enter Crush Name: ");
            student.setCrushName(scan.nextLine());
            System.out.print("Enter Course Code: ");
            student.setCourseCode(scan.nextLine());
            System.out.print("Enter Course Description: ");
            student.setCourseDescription(scan.nextLine());


        System.out.println("Student Added!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        return student;
    }

    public static void retrieve(List<Student> studentList){

        Scanner scan = new Scanner(System.in);
        boolean found = false;

        String studentNumber;
        System.out.print("Enter Student Number: ");
        studentNumber = scan.nextLine();

        for(Student currStudent: studentList){
            if (currStudent.getStudentNumber().equals(studentNumber)){   // if student is found
                System.out.println("Student Found!");
                System.out.println(currStudent);

                System.out.println("\n\n\n\n");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Student not found!");
            System.out.println("\n\n\n\n");
        }
    }


    public static List<Student> delete(List<Student> studentList){

        Scanner scan = new Scanner(System.in);
        boolean found = false;

        String studentNumber;
        System.out.print("Enter Student Number: ");
        studentNumber = scan.nextLine();

        for(Student currStudent: studentList){
            if (currStudent.getStudentNumber().equals(studentNumber)){   // if student is found
                studentList.remove(currStudent);
                System.out.println("Student Deleted!\n\n\n\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found!");
            System.out.println("\n\n\n\n");
        }

        return studentList;
    }


    public static void save(List<Student> studentList, File file) throws FileNotFoundException, IOException{
        
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(studentList);
        
        oos.close();
        System.out.println("Student list saved to database!\n\n\n\n\n");

    }


    public static void update(List<Student> studentList){
        Scanner scan = new Scanner(System.in);
        boolean found = false;

        String studentNumber;
        System.out.print("Enter Student Number: ");
        studentNumber = scan.nextLine();

        for(Student currStudent: studentList){
            if (currStudent.getStudentNumber().equals(studentNumber)){   // if student is found
                found = true;

                System.out.printf("Student with Student Number %s found!\n", currStudent.getStudentNumber());
                System.out.printf("Student Number: %s\n", currStudent.getStudentNumber());
                System.out.print("Enter Year Level: ");
                currStudent.setYearLevel(scan.nextInt());
                scan.nextLine();
                System.out.print("Enter Course: ");
                currStudent.setCourse(scan.nextLine());
                System.out.print("Enter First Name: ");
                currStudent.setFirstName(scan.nextLine());
                System.out.print("Enter Middle Initial: ");
                currStudent.setMiddleInitial((scan.nextLine().charAt(0)));
                System.out.print("Enter Last Name: ");
                currStudent.setLastName(scan.nextLine());

                System.out.printf("Student with Student Number %s updated!\n\n\n", currStudent.getStudentNumber());
            }

        }

        if (!found){
            System.out.println("Student not found!");
            System.out.println("\n\n\n\n");
        }

    }

}