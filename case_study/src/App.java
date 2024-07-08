import Controller.LibraryController;
import Library.Library;

public class App {

    public static void main(String[] args) {
        Library library = new Library();
        LibraryController controller = new LibraryController(library);
        controller.start();
    }
}
