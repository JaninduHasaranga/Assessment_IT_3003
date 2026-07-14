public class Student {


    String studentId ;
    String name ;
    int age ;
    String course ;



    public Student(String studentId, String name , int age, String course) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.course = course;

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

    public String getStudentId() {
        return studentId;
    }

    public void setName (String name){

        if (name == null || name.trim().isEmpty()){
            System.out.println("Name can't be empty!!");
        }else {
            this.name = name ;

        }

    }
    public void setAge (int age){

    if (age<=0){
        System.out.println("Age must be greater than 0!!");
    }else {
        this.age = age ;

    }
    }
    public void setCourse (String course){

        if (course == null || course.trim().isEmpty()){
            System.out.println("course can't be empty!!");
        }else {
            this.course = course ;

        }


        this.course = course ;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student ID: " +studentId + "\n Name:" +name + "\nAge:" + age + "\nCourse: " + course ;
    }

    public void add(Student student) {
        
    }
}

