import java.util.Scanner;

public class MainDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix size (assumes it's a square matrix)
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();

        // Initialize matrix
        double[][] matrix = new double[size][size];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Calculate sum of main diagonal elements
        double diagonalSum = 0;
        for (int i = 0; i < size; i++) {
            diagonalSum += matrix[i][i];
        }

        // Output the sum of the main diagonal
        System.out.println("Sum of the main diagonal elements: " + diagonalSum);

        scanner.close();
    }
}
