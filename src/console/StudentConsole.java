
package console;


import Manager.StudentManager;
import java.util.Scanner;
import studentInfo.Student;


public class StudentConsole {
    private StudentManager sm;
    private Scanner sc;
    public StudentConsole(){
    this.sc=new Scanner(System.in);
    this.sm=new StudentManager();
    }
    private int menu(){
    System.out.println("--------student Menu----------");
    System.out.println("1. Add student");
    System.out.println("2. show all student");
    System.out.println("3. remove student");
    System.out.println("0. Exit");
    System.out.println("enter your choice");
    int choice = readInt(0, 3);
         return choice;   
    }
    public void start(){
    while(true){
    int choice = menu();
    switch(choice){
        case 0:
            System.exit(0);
            break;
        case 1:
            addStudent();
            break;
        case 2:
            showAll();
            break;
        case 3:
            removeStudent();
            break;
        default:
            throw new AssertionError();
    }
    }
    }

    private int readInt(int min, int max) {
        int choice;
        while(true){
            try{
                choice=Integer.parseInt(sc.nextLine());
                if(choice >= min && choice <= max){
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println(" ");
            }
        }   return choice;
    }

    private void addStudent() {
        System.out.println("enter the student id");
        int StudentId=readInt(0, Integer.MAX_VALUE);
        System.out.println("enter the student name");
        String StudentName=sc.nextLine();
        System.out.println("enter the student address");
        String address=sc.nextLine();
        System.out.println("enter the student contact number");
        long contactNo= sc.nextLong();
        
        System.out.println("enter the student gender");
        String gender=sc.next();
        
        System.out.println("enter the student course");
        String course=sc.next();
        Student s=new Student(StudentId, StudentName, address, contactNo, gender, course);
        this.sm.addStudent(s);
        
    }

    

    private void showAll() {
       System.out.println("------all students record----");
       System.out.println("ID\tName\tAddress\tContactNo\tGender\tCourse");
       for(int i=0;i< this.sm.count(); i++){
       Student s=this.sm.getStudent(i);
       System.out.println(s.getStudentId()+"\t"+s.getStudentName()+"\t"+s.getAddress()+"\t"+s.getContactNo()+"\t"+s.getGender()+"\t"+s.getCourse());
       }
    }

    private void removeStudent() {
        System.out.println("enter Id of student");
        int id = readInt(0,Integer.MAX_VALUE);
        boolean result = this.sm.removeStudent(id);
        if(result){
        System.out.println("Student was removed");
        }else{
        System.out.println("student not found");
        }
    }
}
