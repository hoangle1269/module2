package Controller;

import Library.Library;
import Library.AppInterface;
import java.util.Scanner;


public class LibraryController {

    private Library library;
    private Scanner input;

    public LibraryController(Library library) {
        this.library = library;
        this.input = new Scanner(System.in);
    }

    public void start() {
        library.displayMenu();

        int choice;

        do {
            library.showOptions();
            choice = input.nextInt();

            handleChoice(choice);

        } while (choice != AppInterface.EXIT);

        input.close();
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case AppInterface.ADD_BOOK:
                library.addBook();
                break;
            case AppInterface.UPGRADE_BOOK_QTY:
                library.upgradeBookQty();
                break;
            case AppInterface.SEARCH_BOOK:
                handleSearchBook();
                break;
            case AppInterface.SHOW_ALL_BOOKS:
                library.showAllBooks();
                break;
            case AppInterface.ADD_STUDENT:
                library.addStudent();
                break;
            case AppInterface.SHOW_ALL_STUDENTS:
                library.showAllStudents();
                break;
            case AppInterface.CHECKOUT_BOOK:
                library.checkOutBook();
                break;
            case AppInterface.CHECKIN_BOOK:
                library.checkInBook();
                break;
            case AppInterface.EXIT:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("ENTER BETWEEN 0 TO 8.");
        }
    }

    private void handleSearchBook() {
        System.out.println("Press 1 to Search with Book Serial No.");
        System.out.println("Press 2 to Search with Book's Author Name.");
        int searchChoice = input.nextInt();
        library.searchBook(searchChoice);
    }
}

