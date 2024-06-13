import java.util.Scanner;

public class FindBiggest {
    public static void main(String[] args) {

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size should not be exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element: " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Property list");
        for (i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        int max = 0;
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " , at position " + index);

    }
}
