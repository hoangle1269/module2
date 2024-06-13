import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create two arrays with given sizes
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        // Step 2: Populate the arrays with user input
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Step 3: Create a third array with size equal to the sum of the first two arrays' sizes
        int[] mergedArray = new int[size1 + size2];

        // Step 4: Copy elements from the first array to the third array
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }

        // Step 5: Copy elements from the second array to the third array
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

        // Output the merged array
        System.out.println("Merged array:");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
