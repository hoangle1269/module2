package Book;

import java.io.*;
import java.util.*;

public class Books {
    private static final String FILE_NAME = "Books.csv";
    private List<Book> books;

    public Books() {
        this.books = loadBooks();
    }

    private List<Book> loadBooks() {
        List<Book> bookList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                bookList.add(Book.fromCSV(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    public void saveBooks() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Book book : books) {
                bw.write(book.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
        saveBooks();
    }

    public void removeBook(String ISBN) {
        books.removeIf(book -> book.getISBN().equals(ISBN));
        saveBooks();
    }

    public void updateBook(Book updatedBook) {
        for (Book book : books) {
            if (book.getISBN().equals(updatedBook.getISBN())) {
                book.setNumberOfCopies(updatedBook.getNumberOfCopies());
                break;
            }
        }
        saveBooks();
    }

    public Book getBookByISBN(String ISBN) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }
        return null;
    }
}

