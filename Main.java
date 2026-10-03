import java.util.Scanner;

import model.Student;
import service.StudentService;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentService studentService = new StudentService();

        boolean running = true;

        while (running) {

            System.out.println("\n===== HOSTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Remove Student");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scanner.nextLine();

                    System.out.print("Enter Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter Total Fee: ");
                    double totalFee = scanner.nextDouble();
                    scanner.nextLine();

                    Student student = new Student(
                            id,
                            name,
                            email,
                            course,
                            year,
                            phone,
                            totalFee
                    );

                    studentService.addStudent(student);

                    System.out.println("Student added successfully.");

                    break;

                case 2:

                    System.out.print("Enter Student ID: ");
                    int searchId = scanner.nextInt();

                    Student foundStudent =
                            studentService.getStudentById(searchId);

                    if (foundStudent != null) {

                        System.out.println("\nStudent Found");
                        System.out.println("ID: " + foundStudent.getId());
                        System.out.println("Name: " + foundStudent.getName());
                        System.out.println("Email: " + foundStudent.getEmail());
                        System.out.println("Course: " + foundStudent.getCourse());
                        System.out.println("Year: " + foundStudent.getYear());
                        System.out.println("Phone: " + foundStudent.getPhone());
                        System.out.println("Room: " + foundStudent.getRoomNumber());
                        System.out.println("Pending Fee: " +
                                foundStudent.getPendingFee());

                    } else {

                        System.out.println("Student not found.");
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID to remove: ");
                    int removeId = scanner.nextInt();

                    if (studentService.removeStudent(removeId)) {

                        System.out.println("Student removed successfully.");

                    } else {

                        System.out.println("Student not found.");
                    }

                    break;

                case 4:

                    if (studentService.getAllStudents().isEmpty()) {

                        System.out.println("No students available.");

                    } else {

                        System.out.println("\n===== ALL STUDENTS =====");

                        for (Student s : studentService.getAllStudents()) {

                            System.out.println(
                                    "ID: " + s.getId() +
                                    " | Name: " + s.getName() +
                                    " | Course: " + s.getCourse() +
                                    " | Room: " + s.getRoomNumber()
                            );
                        }
                    }

                    break;

                case 5:

                    running = false;
                    System.out.println("Exiting Hostel Management System.");

                    break;

                default:

                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}