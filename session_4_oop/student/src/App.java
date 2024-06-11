import src.Student;
import src.StudentManagementSystem;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("CG1", "Peter", "pete@gmail.com", "0123456", 3.5);
        Student s2 = new Student("CG2", "Tony", "tony@gmail.com", "0987656", 3.7);

        StudentManagementSystem studentManagementSystem = new StudentManagementSystem(10);
        studentManagementSystem.addStudent(s1);
        studentManagementSystem.addStudent(s2);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Edit Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Show Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    studentManagementSystem.addStudentFromKeyboard(scanner);
                    break;
                case 2:
                    studentManagementSystem.editStudentFromKeyboard(scanner);
                    break;
                case 3:
                    studentManagementSystem.deleteStudentFromKeyboard(scanner);
                    break;
                case 4:
                    studentManagementSystem.showStudent();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
