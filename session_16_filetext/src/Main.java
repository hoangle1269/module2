import java.io.*;
import java.util.Scanner;

public class Main {

    public static final int ADD_STUDENT = 1;
    public static final int SHOW_LIST_STUDENT = 2;
    public static final int DELETE_STUDENT = 3;
    public static final int UPDATE_STUDENT = 4;
    public static final int IMPORT_STUDENT = 5;
    public static final int EXPORT_STUDENT = 6;
    public static final int EXIT = 10;

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                showMainMenu();
                int choice = scanner.nextInt();

                switch (choice) {
                    case ADD_STUDENT:
                        StudentManager.addStudent();
                        break;
                    case SHOW_LIST_STUDENT:
                        StudentManager.showListStudent();
                        break;
                    case DELETE_STUDENT:
                        StudentManager.deleteStudent();
                        break;
                    case UPDATE_STUDENT:
                        StudentManager.updateStudent();
                        break;
                    case IMPORT_STUDENT:
                        StudentManager.importStudentFromFile();
                        break;
                    case EXPORT_STUDENT:
                        StudentManager.exportStudentFromFile();
                        break;
                    case EXIT:
                        StudentManager.exit();
                        break;
                    default:
                        System.out.println("Invalid number! Input again!");

                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("----Enter choice number----");
        System.out.println("1: Add student");
        System.out.println("2: Show list students");
        System.out.println("3: Delete students");
        System.out.println("4: Update students");
        System.out.println("5: Import students from file: ");
        System.out.println("6: Export students to file: ");
        System.out.println("10: Exit");
    }
}