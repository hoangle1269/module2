import java.util.Scanner;

public class StudentPassCount {
    public static void main(String[] args) {
        final int MAX_STUDENTS = 30;
        int[] scores = new int[MAX_STUDENTS];
        int studentCount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students (up to 30): ");
        studentCount = scanner.nextInt();

        // Validate the number of students
        if (studentCount > MAX_STUDENTS) {
            System.out.println("The number of students cannot exceed 30.");
            return;
        }

        // Input scores
        System.out.println("Enter the scores of the students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.print("Student " + (i + 1) + " score: ");
            scores[i] = scanner.nextInt();
        }

        // Count the number of students who passed
        int passCount = 0;
        for (int i = 0; i < studentCount; i++) {
            if (scores[i] >= 5) {
                passCount++;
            }
        }

        // Display the number of students who passed
        System.out.println("Number of students who passed: " + passCount);
    }
}
