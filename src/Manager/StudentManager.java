
package Manager;
    
import java.util.ArrayList;
import java.util.List;
import studentInfo.Student;


public class StudentManager {
    private List<Student> listOfStudent;
    public StudentManager(){
    this.listOfStudent=new ArrayList<>();
    }
    public int addStudent(Student s){
    this.listOfStudent.add(s);
    return count();
    }
    public int count(){
    return this.listOfStudent.size();
    }
    public Student getStudent(int index){
    if(index <0 || index >= count()){
    return null;
    }
    return this.listOfStudent.get(index);
    }
    public boolean removeStudent(int StudentId){
    int index = -1;
    for(int i=0, n=count(); i<n; i++){
    if(this.listOfStudent.get(i).getStudentId()==StudentId){
    index=i;
    break;
    }
    }
    if(index != -1){
    this.listOfStudent.remove(index);
    return true;
    }
    return false;
    }
}
