package ConvertSystem;

// Testing the ConvertSystem.ConvertCounterSystem class
public class ConvertSystemTest {
    public static void main(String[] args) {
        ConvertSystem converter = new ConvertCounterSystem();

        int number = 123;

        // Test each conversion method
        System.out.println("Decimal (" + number + "): " + converter.convertDecimal(number));
        System.out.println("Binary (" + number + "): " + converter.convertBinary(number));
        System.out.println("Octal (" + number + "): " + converter.convertOctal(number));
        System.out.println("Hexadecimal (" + number + "): " + converter.convertHexadecimal(number));
    }
}
