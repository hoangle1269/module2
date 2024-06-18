public class FizzBuzzTranslate {
    public static String fizzBuzzTranslator(int x) {
        if (x > 0) {
            if (x % 3 == 0 && x % 5 == 0) {
                return "FizzBuzz";
            }
            if (x % 3 == 0) {
                return "Fizz";
            }
            if (x % 5 == 0) {
                return "Buzz";
            }
        }
        return String.valueOf(x);
    }
}
