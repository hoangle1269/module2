package Book;

import java.util.Scanner;

public class Book {
    public int serialNumber;
    public String bookName;
    public String authorName;
    public int bookQuantity;
    public int bookQuantityCopy;
    Scanner input = new Scanner(System.in);

    public Book() {
        System.out.println("Enter Serial No of Book:");
        this.serialNumber = input.nextInt();
        input.nextLine();

        System.out.println("Enter Book Name:");
        this.bookName = input.nextLine();

        System.out.println("Enter Author Name:");
        this.authorName = input.nextLine();

        System.out.println("Enter Quantity of Books:");
        this.bookQuantity = input.nextInt();
        bookQuantityCopy = this.bookQuantity;
    }

    public String toCSV() {
        return serialNumber + "," + bookName + "," + authorName + "," + bookQuantity + "," + bookQuantityCopy;
    }
}
