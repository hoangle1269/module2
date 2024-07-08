package Library;

import Book.Books;
import Book.Book;
import Student.Students;
import Student.Student;

public class Library {

    private Books books;
    private Students students;

    public Library() {
        books = new Books();
        students = new Students();
    }

    public void displayMenu() {
        System.out.println(
                "Welcome to the National Library!");
        System.out.println(
                "Select From The Following Options: ");
        System.out.println(
                "*************************************");
    }

    public void showOptions() {
        books.displayMenu();
    }

    public void addBook() {
        Book b = new Book();
        books.addBook(b);
    }

    public void upgradeBookQty() {
        books.upgradeBookQuantity();
    }

    public void searchBook(int searchChoice) {
        switch (searchChoice) {
            case AppInterface.SEARCH_BY_SERIAL_NO:
                books.searchBySno();
                break;
            case AppInterface.SEARCH_BY_AUTHOR_NAME:
                books.searchByAuthorName();
                break;
        }
    }

    public void showAllBooks() {
        books.showAllBooks();
    }

    public void addStudent() {
        Student s = new Student();
        students.addStudent(s);
    }

    public void showAllStudents() {
        students.showAllStudents();
    }

    public void checkOutBook() {
        students.checkOutBook(books);
    }

    public void checkInBook() {
        students.checkInBook(books);
    }
}
