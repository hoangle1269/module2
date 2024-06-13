import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {
        // Step 1: Declare a string and assign a value to it
        String str = "This is a sample string.";

        // Step 2: Declare a character variable and get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character to count:");
        char ch = scanner.next().charAt(0);

        // Step 3: Declare the count variable
        int count = 0;

        // Step 4: Loop through the string and count occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        // Step 5: Print the count
        System.out.println("The character '" + ch + "' appears " + count + " times in the string.");
    }
}
