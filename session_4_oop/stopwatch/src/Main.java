public class Main {
    public static void main(String[] args) {

        // tao mang 100000 so
        int[] testArray = new int[100000];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 100000);
        }

    }
}