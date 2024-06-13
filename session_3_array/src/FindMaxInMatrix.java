import java.util.Scanner;

public class FindMaxInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Predefined matrix
        double[][] predefinedMatrix = {
                {1.2, 3.4, 5.6},
                {7.8, 9.0, 2.3},
                {4.5, 6.7, 8.9}
        };

        findMaxInMatrix(predefinedMatrix);

        // Step 2: User-defined matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        double[][] userMatrix = new double[rows][cols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        findMaxInMatrix(userMatrix);
    }

    public static void findMaxInMatrix(double[][] matrix) {
        double maxValue = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Maximum value: " + maxValue);
        System.out.println("Location: (" + maxRow + ", " + maxCol + ")");
    }
}
