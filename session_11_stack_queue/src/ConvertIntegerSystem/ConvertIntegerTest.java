package ConvertIntegerSystem;

import java.util.Scanner;

public class ConvertIntegerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Corrected Scanner initialization
        System.out.println("Input number: ");
        int x = scanner.nextInt();

        ConvertIntegerSystem converter = new ConvertIntegerSystem();

        System.out.println("Binary: " + converter.convertBinary(x));
        System.out.println("Octal: " + converter.convertOctal(x));
        System.out.println("Hexadecimal: " + converter.convertHexadecimal(x));
        System.out.println("Decimal: " + converter.convertDecimal(x));
    }
}
