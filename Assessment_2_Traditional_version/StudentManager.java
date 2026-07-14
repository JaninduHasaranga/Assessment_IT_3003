
import java.util.ArrayList;
public class StudentManager {

    private ArrayList<Student> students ;

    public StudentManager() {

        students = new ArrayList<>();

    }


    public void addStudent(Student student) {
        students.add(student) ;

        System.out.println("Student added successfully.");

    }
    public void viewStudents(){

        if (students.isEmpty()){

            System.out.println("No student records found.");
            return;

        }

        System.out.println("\n----- Student List -----");

        for(Student student : students){

            System.out.println(student);

        }

    }

    public Student searchStudent(String studentId){
        for (Student student : students){
            if (student.getStudentId().equals(studentId)){
                return student;
            }
        }
        return null ;

    }

    public void updateStudent(String studentID , String name , int age , String course ){

        Student student = searchStudent(studentID);

    if (student != null){
        student.setName(name);
        student.setAge(age);
        student.setCourse(course);

        System.out.println("Student updated successfully.");

        return;
    }
        System.out.println("Student not found");
    }

    public boolean deleteStudent(String studentId){
        Student student = searchStudent(studentId);


        if(student != null) {


            students.remove(student);


            System.out.println("Student deleted successfully.");

            return true;

        }


        System.out.println("Student not found.");

        return false;


    }



}
