import java.util.Scanner;

public class NumberToWordsConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number (0-999): ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability"); // Nếu số không nằm trong khoảng cho phép
        } else {
            String words = convertNumberToWords(number);
            System.out.println(words);
        }
    }

    public static String convertNumberToWords(int number) {
        // Mảng chứa các từ tương ứng với các số
        String[] units = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "ten", "twenty", "thirty", "forty",
                "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (number < 10) {
            return units[number]; // Đọc số từ 0 đến 9
        } else if (number < 20) {
            return teens[number - 10]; // Đọc số từ 11 đến 19
        } else if (number < 100) {
            int tensDigit = number / 10;
            int onesDigit = number % 10;
            if (onesDigit == 0) {
                return tens[tensDigit]; // Đọc các số như 20, 30, ..., 90
            } else {
                return tens[tensDigit] + " " + units[onesDigit]; // Đọc các số từ 21 đến 99
            }
        } else {
            int hundredsDigit = number / 100;
            int remainingTwoDigits = number % 100;
            if (remainingTwoDigits == 0) {
                return units[hundredsDigit] + " hundred"; // Đọc các số như 100, 200, ..., 900
            } else {
                return units[hundredsDigit] + " hundred and " + convertNumberToWords(remainingTwoDigits); // Đọc các số từ 101 đến 999
            }
        }
    }
}
