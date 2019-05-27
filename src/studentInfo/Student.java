
package studentInfo;


public class Student {
    private int studentId;
    private String studentName;
    private String address;
    private long contactNo;
    String gender;
    String course;
    

    public Student(int studentId, String studentName, String address, long contactNo, String gender, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.address = address;
        this.contactNo = contactNo;
        this.gender = gender;
        this.course = course;
        
    }

   

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
}
