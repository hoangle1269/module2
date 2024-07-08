package Observer;

import java.util.Scanner;

public class ObserverApp {
    public static void main(String[] args) {
        Subject sub = new Subject();

        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            sub.setState(scanner.nextInt());
            sub.execute();
        }
    }
}
