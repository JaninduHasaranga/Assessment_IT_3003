import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    // Add student
    public boolean addStudent(Student student) {

        if (searchStudent(student.getStudentId()) != null) {
            return false; // Duplicate ID found
        }

        students.add(student);
        return true;
    }

    // View all students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n===== STUDENT LIST =====");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Search student by ID
    public Student searchStudent(String id) {

        for (Student student : students) {
            if (student.getStudentId().equalsIgnoreCase(id)) {
                return student;
            }
        }

        return null;
    }

    // Delete student
    public boolean deleteStudent(String id) {

        Student student = searchStudent(id);

        if (student != null) {
            students.remove(student);
            return true;
        }

        return false;
    }
}