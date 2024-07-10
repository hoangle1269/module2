package Controller;

import Book.Books;
import Book.Book;
import java.util.Scanner;

public class StudentMenu implements Constants {
    private static Books books = new Books();

    public static void display() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Student Menu");
            System.out.println(STUDENT_MENU_SHOW_ALL_BOOKS + ". Show All Books");
            System.out.println(STUDENT_MENU_BORROW_BOOKS + ". Borrow Books");
            System.out.println(STUDENT_MENU_RETURN_BOOKS + ". Return Books");
            System.out.println(STUDENT_MENU_BACK_TO_MAIN + ". Back to Main Menu");
            System.out.print("Choose an option: ");

            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case STUDENT_MENU_SHOW_ALL_BOOKS:
                        showAllBooks();
                        break;
                    case STUDENT_MENU_BORROW_BOOKS:
                        borrowBooks(scanner);
                        break;
                    case STUDENT_MENU_RETURN_BOOKS:
                        returnBooks(scanner);
                        break;
                    case STUDENT_MENU_BACK_TO_MAIN:
                        return;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input, please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    private static void showAllBooks() {
        for (Book book : books.getBooks()) {
            System.out.println(book);
        }
    }

    private static void borrowBooks(Scanner scanner) {
        System.out.println("Enter ISBN of the book to borrow: ");
        String ISBN = scanner.next();
        Book book = books.getBookByISBN(ISBN);
        if (book != null && book.getNumberOfCopies() > 0) {
            book.setNumberOfCopies(book.getNumberOfCopies() - 1);
            books.saveBooks();
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }

    private static void returnBooks(Scanner scanner) {
        System.out.println("Enter ISBN of the book to return: ");
        String ISBN = scanner.next();
        Book book = books.getBookByISBN(ISBN);
        if (book != null) {
            book.setNumberOfCopies(book.getNumberOfCopies() + 1);
            books.saveBooks();
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}
