import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Input size!" + "\n");
            size = scanner.nextInt();
            array = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.println("Input element: " + i);
                int element = scanner.nextInt();
                array[i] = element;
            }
            for (int element : array) {
                System.out.print(element + " ");
            }
        }
    }
}