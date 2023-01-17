
package student1;


public class StudentList {
    public static void main(String[] args){
        //Student1 s1 = new Student1("s1","Juliean");
        Student1[] studentList = new Student1[3];
        studentList[0] = new Student1("s1", "Juliean"); 
        studentList[1] = new Student1("s2", "Amber");
        studentList[2] = new Student1("s3", "Farzana");
        
        for(int i =0; i<studentList.length; i++) {
            System.out.println(i);
            System.out.println(studentList[i].getStudentName());
            
        }
    }
    
}
