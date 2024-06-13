public class FirstTwentyPrimes {
    public static void main(String[] args) {
        int numbers = 20;  // Number of prime numbers to display
        int count = 0;     // Count of prime numbers found
        int N = 2;         // Number to check if prime

        System.out.println("The first " + numbers + " prime numbers are:");

        while (count < numbers) {
            // Check if N is a prime number
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            // Move to the next number
            N++;
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
