package ConvertSystem;

// Implement the interface with ConvertSystem.ConvertCounterSystem class
public class ConvertCounterSystem implements ConvertSystem {

    @Override
    public String convertBinary(int number) {
        return Integer.toBinaryString(number);
    }

    @Override
    public String convertOctal(int number) {
        return Integer.toOctalString(number);
    }

    @Override
    public String convertHexadecimal(int number) {
        return Integer.toHexString(number);
    }

    @Override
    public String convertDecimal(int number) {
        return Integer.toString(number);
    }

    // Additional methods if needed
}

