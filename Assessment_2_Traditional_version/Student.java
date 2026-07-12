public class Student {

    String name ;
    int age ;
    String course ;
    String studentId ;


    public Student(String name, int age, String course, String studentId) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.studentId = studentId;
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
        this.name = name ;

    }
    public void setAge (int age){
        this.age = age ;
    }
    public void setCourse (String course){
        this.course = course ;
    }

    @Override
    public String toString (){

        return "..." ; 
    }

}

