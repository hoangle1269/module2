import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("----Enter choice number----");
                System.out.println("1: Add student");
                System.out.println("2: Show list students");
                System.out.println("3: Delete students");
                System.out.println("4: Update students");
                System.out.println("5: Import students from file: ");
                System.out.println("6: Export students to file: ");
                System.out.println("10: Exit");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        StudentManager.addStudent();
                        break;
                    case 2:
                        StudentManager.showListStudent();
                        break;
                    case 3:
                        StudentManager.deleteStudent();
                        break;
                    case 4:
                        StudentManager.updateStudent();
                        break;
                    case 5:
                        StudentManager.importStudentFromFile();
                        break;
                    case 6:
                        StudentManager.exportStudentFromFile();
                        break;
                    case 10:
                        StudentManager.exit();
                        break;
                    default:
                        System.out.println("Invalid number! Input again!");

                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid number! Input again!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}