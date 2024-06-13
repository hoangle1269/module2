import java.util.Scanner;

//public class ColumnSum {
//    public static void main(String[] args) {
//        // Predefined 2D array
//        double[][] array = {
//                {1.2, 2.3, 3.4},
//                {4.5, 5.6, 6.7},
//                {7.8, 8.9, 9.0}
//        };
//
//        Scanner scanner = new Scanner(System.in);
//
//        // Ask the user for the column index
//        System.out.print("Enter the column index (starting from 0): ");
//        int columnIndex = scanner.nextInt();
//
//        // Calculate the sum of the specified column
//        double sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (columnIndex < array[i].length) {
//                sum += array[i][columnIndex];
//            } else {
//                System.out.println("Column index out of bounds for row " + i);
//                return;
//            }
//        }
//
//        // Print the result
//        System.out.println("The sum of the elements in column " + columnIndex + " is: " + sum);
//    }
//}

//import java.util.Scanner;

public class ColumnSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the 2D array from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the 2D array
        double[][] array = new double[rows][cols];

        // Get the values of the 2D array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextDouble();
            }
        }

        // Ask the user for the column index
        System.out.print("Enter the column index (starting from 0): ");
        int columnIndex = scanner.nextInt();

        // Calculate the sum of the specified column
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            if (columnIndex < array[i].length) {
                sum += array[i][columnIndex];
            } else {
                System.out.println("Column index out of bounds for row " + i);
                return;
            }
        }

        // Print the result
        System.out.println("The sum of the elements in column " + columnIndex + " is: " + sum);
    }
}
