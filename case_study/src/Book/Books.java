package Book;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Books {
    Book[] theBooks = new Book[50];
    public static int count;
    Scanner input = new Scanner(System.in);

    public int compareBookObjects(Book b1, Book b2) {

        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {

            System.out.println(
                    "Book of this Name Already Exists.");
            return 0;
        }

        if (b1.serialNumber == b2.serialNumber) {

            System.out.println(
                    "Book of this Serial No Already Exists.");

            return 0;
        }
        return 1;
    }

    public void addBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (this.compareBookObjects(b, this.theBooks[i]) == 0)
                return;
        }

        if (count < 50) {
            theBooks[count] = b;
            count++;
            saveBookToFile(b);
        } else {
            System.out.println("No Space to Add More Books.");
        }
    }

    private void saveBookToFile(Book b) {
        try (FileWriter writer = new FileWriter("Books.csv", true)) {
            writer.write(b.toCSV() + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred while saving the book to file.");
            e.printStackTrace();
        }
    }

    public void searchBySno() {
        System.out.println("\t\t\t\tSEARCH BY SERIAL NUMBER\n");
        int sNo;
        System.out.println("Enter Serial No of Book:");
        sNo = input.nextInt();
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].serialNumber) {
                System.out.println(theBooks[i].serialNumber + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" + theBooks[i].bookQuantityCopy + "\t\t" + theBooks[i].bookQuantity);
                return;
            }
        }
        System.out.println("No Book for Serial No " + sNo + " Found.");
    }

    public void searchByAuthorName() {
        System.out.println("\t\t\t\tSEARCH BY AUTHOR'S NAME");
        input.nextLine();
        System.out.println("Enter Author Name:");
        String authorName = input.nextLine();
        int flag = 0;
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {
            if (authorName.equalsIgnoreCase(theBooks[i].authorName)) {
                System.out.println(theBooks[i].serialNumber + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" + theBooks[i].bookQuantityCopy + "\t\t" + theBooks[i].bookQuantity);
                flag++;
            }
        }
        if (flag == 0)
            System.out.println("No Books of " + authorName + " Found.");
    }

    public void showAllBooks() {
        System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {
            System.out.println(theBooks[i].serialNumber + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" + theBooks[i].bookQuantityCopy + "\t\t" + theBooks[i].bookQuantity);
        }
    }

    public void upgradeBookQuantity() {
        System.out.println("\t\t\t\tUPGRADE QUANTITY OF A BOOK\n");
        System.out.println("Enter Serial No of Book");
        int sNo = input.nextInt();
        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].serialNumber) {
                System.out.println("Enter No of Books to be Added:");
                int addingQty = input.nextInt();
                theBooks[i].bookQuantity += addingQty;
                theBooks[i].bookQuantityCopy += addingQty;
                return;
            }
        }
    }

    public void displayMenu() {
        System.out.println("--------------------------------");
        System.out.println("Press 0 to Exit Application.");
        System.out.println("Press 1 to Add new Book.");
        System.out.println("Press 2 to Upgrade Quantity of a Book.");
        System.out.println("Press 3 to Search a Book.");
        System.out.println("Press 4 to Show All Books.");
        System.out.println("Press 5 to Register Student.");
        System.out.println("Press 6 to Show All Registered Students.");
        System.out.println("Press 7 to Check Out Book.");
        System.out.println("Press 8 to Check In Book.");
        System.out.println("---------------------------------");
    }

    public int isAvailable(int sNo) {
        for (int i = 0; i < count; i++) {
            if (sNo == theBooks[i].serialNumber) {
                if (theBooks[i].bookQuantityCopy > 0) {
                    System.out.println("Book is Available.");
                    return i;
                }
                System.out.println("Book is Unavailable");
                return -1;
            }
        }
        System.out.println("No Book of Serial Number Available in Library.");
        return -1;
    }

    public Book checkOutBook() {
        System.out.println("Enter Serial No of Book to be Checked Out.");
        int sNo = input.nextInt();
        int bookIndex = isAvailable(sNo);
        if (bookIndex != -1) {
            theBooks[bookIndex].bookQuantityCopy--;
            return theBooks[bookIndex];
        }
        return null;
    }

    public void checkInBook(Book b) {
        for (int i = 0; i < count; i++) {
            if (b.equals(theBooks[i])) {
                theBooks[i].bookQuantityCopy++;
                return;
            }
        }
    }
}
