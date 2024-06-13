import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        // Step 1: Declare and initialize an array of integers
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int n = array.length;

        // Step 2: Input X as the element to be removed
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to be removed: ");
        int x = scanner.nextInt();

        // Step 3: Find X in the array
        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                index_del = i;
                break;
            }
        }

        // If X is not found in the array
        if (index_del == -1) {
            System.out.println("Element not found in the array.");
        } else {
            // Step 4: Remove the element X from the array
            for (int i = index_del; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
            // Optional: Set the last element to 0 (or any default value)
            array[n - 1] = 0;

            // Step 5: Print the array after deletion
            System.out.print("New array after deletion: ");
            for (int j : array) {
                System.out.print(j + " ");
            }
        }
    }
}
