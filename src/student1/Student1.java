
package student1;

/*
*
*This class ++ Insert class description here +++
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
