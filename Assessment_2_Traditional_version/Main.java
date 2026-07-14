import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();


        while (true) {

            System.out.println("\n*** Student Management System ***");
            System.out.println("1 - Add Student");
            System.out.println("2 - View Students");
            System.out.println("3 - Search Student");
            System.out.println("4 - Update Student");
            System.out.println("5 - Delete Student");
            System.out.println("6 - Exit");


            System.out.print("\nEnter your choice (1 to 6): ");

            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {


                case 1 -> {

                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();


                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();


                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();


                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();


                    Student student = new Student(id, name, age, course);


                    manager.addStudent(student);

                }



                case 2 -> {

                    manager.viewStudents();

                }



                case 3 -> {

                    System.out.print("Enter Student ID to search: ");
                    String searchId = sc.nextLine();


                    Student foundStudent = manager.searchStudent(searchId);


                    if (foundStudent != null) {

                        System.out.println("\nStudent Found:");
                        System.out.println(foundStudent);

                    }
                    else {

                        System.out.println("Student not found.");

                    }

                }



                case 4 -> {

                    System.out.print("Enter Student ID to update: ");
                    String updateID = sc.nextLine();


                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();


                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();


                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();


                    manager.updateStudent(updateID, newName, newAge, newCourse);

                }



                case 5 -> {

                    System.out.print("Enter Student ID to delete: ");
                    String deleteId = sc.nextLine();


                    manager.deleteStudent(deleteId);

                }



                case 6 -> {

                    System.out.println("Exiting System.....");

                    sc.close();

                    return;

                }



                default -> {

                    System.out.println("Invalid choice! Please try again.");

                }

            }

        }

    }

}