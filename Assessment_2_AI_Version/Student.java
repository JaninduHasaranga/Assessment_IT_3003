public class Student {

    private String studentId;
    private String name;
    private int age;
    private String course;

    public Student(String studentId, String name, int age, String course) {
        this.studentId = studentId;
        this.name = name;
        setAge(age); // Validation through setter
        this.course = course;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException(
                    "Age must be greater than zero."
            );
        }
        this.age = age;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "\nStudent ID : " + studentId +
                "\nName       : " + name +
                "\nAge        : " + age +
                "\nCourse     : " + course +
                "\n---------------------------";
    }
}