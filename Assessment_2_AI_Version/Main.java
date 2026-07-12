import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;

        do {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                sc.next();
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    String id;
                    String name;
                    int age;
                    String course;

                    // Validate ID
                    while (true) {
                        System.out.print("Enter Student ID: ");
                        id = sc.nextLine().trim();

                        if (id.isEmpty()) {
                            System.out.println(
                                    "Student ID cannot be empty."
                            );
                        } else {
                            break;
                        }
                    }

                    // Validate Name
                    while (true) {
                        System.out.print("Enter Student Name: ");
                        name = sc.nextLine().trim();

                        if (name.isEmpty()) {
                            System.out.println(
                                    "Student name cannot be empty."
                            );
                        } else {
                            break;
                        }
                    }

                    // Validate Age
                    while (true) {

                        try {
                            System.out.print("Enter Age: ");
                            age = Integer.parseInt(
                                    sc.nextLine());

                            if (age <= 0) {
                                System.out.println(
                                        "Age must be greater than 0."
                                );
                            } else {
                                break;
                            }

                        } catch (NumberFormatException e) {
                            System.out.println(
                                    "Please enter a valid number."
                            );
                        }
                    }

                    System.out.print("Enter Course: ");
                    course = sc.nextLine();

                    Student student =
                            new Student(id, name, age, course);

                    if (manager.addStudent(student)) {
                        System.out.println(
                                "Student added successfully."
                        );
                    } else {
                        System.out.println(
                                "Student ID already exists."
                        );
                    }

                    break;

                case 2:

                    manager.viewStudents();
                    break;

                case 3:

                    System.out.print(
                            "Enter Student ID to search: "
                    );

                    id = sc.nextLine();

                    Student foundStudent =
                            manager.searchStudent(id);

                    if (foundStudent != null) {
                        System.out.println(foundStudent);
                    } else {
                        System.out.println(
                                "Student not found."
                        );
                    }

                    break;

                case 4:

                    System.out.print(
                            "Enter Student ID to update: "
                    );

                    id = sc.nextLine();

                    Student updateStudent =
                            manager.searchStudent(id);

                    if (updateStudent != null) {

                        // New Name
                        while (true) {
                            System.out.print(
                                    "Enter New Name: "
                            );

                            name = sc.nextLine().trim();

                            if (name.isEmpty()) {
                                System.out.println(
                                        "Name cannot be empty."
                                );
                            } else {
                                break;
                            }
                        }

                        // New Age
                        while (true) {

                            try {
                                System.out.print(
                                        "Enter New Age: "
                                );

                                age = Integer.parseInt(
                                        sc.nextLine());

                                if (age <= 0) {
                                    System.out.println(
                                            "Age must be greater than 0."
                                    );
                                } else {
                                    break;
                                }

                            } catch (
                                    NumberFormatException e
                            ) {
                                System.out.println(
                                        "Enter a valid number."
                                );
                            }
                        }

                        System.out.print(
                                "Enter New Course: "
                        );

                        course = sc.nextLine();

                        updateStudent.setName(name);
                        updateStudent.setAge(age);
                        updateStudent.setCourse(course);

                        System.out.println(
                                "Student updated successfully."
                        );

                    } else {
                        System.out.println(
                                "Student not found."
                        );
                    }

                    break;

                case 5:

                    System.out.print(
                            "Enter Student ID to delete: "
                    );

                    id = sc.nextLine();

                    if (manager.deleteStudent(id)) {
                        System.out.println(
                                "Student deleted successfully."
                        );
                    } else {
                        System.out.println(
                                "Student not found."
                        );
                    }

                    break;

                case 6:

                    System.out.println(
                            "Thank you for using the system!"
                    );
                    break;

                default:

                    System.out.println(
                            "Invalid choice. Please try again."
                    );
            }

        } while (choice != 6);

        sc.close();
    }
}