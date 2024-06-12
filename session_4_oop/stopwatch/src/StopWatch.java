import java.util.Arrays;

public class StopWatch {
    // Private fields
    private long startTime;
    private long endTime;

    // Constructor
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Getter for startTime
    public long getStartTime() {
        return this.startTime;
    }

    // Getter for endTime
    public long getEndTime() {
        return this.endTime;
    }

    // Method to start the stopwatch
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Method to stop the stopwatch
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Method to get the elapsed time in milliseconds
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    // Method for selection sort
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Main method to test the StopWatch and selection sort
    public static void main(String[] args) {
        // Generate an array with 100,000 random numbers
        int[] testArray = new int[100000];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = (int) (Math.random() * 100000);
        }

        // Create a StopWatch instance
        StopWatch stopWatch = new StopWatch();

        // Start the stopwatch
        stopWatch.start();

        // Perform selection sort on the array
        selectionSort(testArray);

        // Stop the stopwatch
        stopWatch.stop();

        // Get and print the elapsed time
        long elapsedTime = stopWatch.getElapsedTime();
        System.out.println("Elapsed time for selection sort: " + elapsedTime + " milliseconds");
    }
}
