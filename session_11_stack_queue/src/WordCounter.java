import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        // Sample text input (can be replaced with any text source)
        String text = "Hello world! This is a test. Hello again, world. Hello TreeMap!";

        // Convert the entire string to lowercase to ensure case insensitivity
        text = text.toLowerCase();

        // Use a TreeMap to store words and their counts
        TreeMap<String, Integer> wordCounts = new TreeMap<>();

        // Split the text into words based on non-word characters
        String[] words = text.split("\\W+");

        // Iterate over the words and update their counts in the TreeMap
        for (String word : words) {
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        // Print the words and their counts in alphabetical order
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
