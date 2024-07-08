package Student;

import Book.Book;
import java.util.Scanner;

public class Student {
    String studentName;
    String registerNumber;
    Book borrowedBooks[] = new Book[3];
    public int booksCount = 0;
    Scanner input = new Scanner(System.in);

    public Student() {
        System.out.println("Enter Student Name:");
        this.studentName = input.nextLine();

        System.out.println("Enter Registration Number:");
        this.registerNumber = input.nextLine();
    }

    public String toCSV() {
        return studentName + "," + registerNumber;
    }
}
