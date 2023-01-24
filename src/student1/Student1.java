
package student1;

/*
*
*updated on January 24, 2023
*
* @author Juliean Do 
*/
/**
 *
 * @author julieando
 */
public class Student1 {
    private String studentId;
    private String studentName; 
    private String address; 

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student1(String studentId, String studentName) {
        // using s-file name you don't need to use full name (e.g., sid or sname), in the parameters
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    


}
