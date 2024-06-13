import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Declare and initialize an array with a fixed size N
        int N = 10; // For example, N = 10
        int[] array = new int[N];

        // Initialize array with some default values
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1; // Just an example, initializing with values 1 to 10
        }

        System.out.println("Original array:");
        printArray(array);

        // Step 2: Input X, the number to be inserted
        System.out.print("Enter the value to be inserted: ");
        int X = scanner.nextInt();

        // Step 3: Input the index at which X should be inserted
        System.out.print("Enter the index where the value should be inserted: ");
        int index = scanner.nextInt();

        // Step 4: Check if the index is valid
        if (index < 0 || index > array.length - 1) {
            System.out.println("Cannot insert the element at the specified index.");
        } else {
            // Step 5: Insert the element at the specified index
            array = insertElement(array, X, index);

            // Step 6: Print the array
            System.out.println("Array after insertion:");
            printArray(array);
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Method to insert an element at a specified index in an array
    public static int[] insertElement(int[] array, int element, int index) {
        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }

        newArray[index] = element;

        for (int i = index; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
    }
}
