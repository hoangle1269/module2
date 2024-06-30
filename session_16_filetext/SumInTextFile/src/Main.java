import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String realPath = "session_16_filetext\\SumInTextFile\\numbers.txt";
        System.out.println(realPath);

        System.out.println("Input filepath:");
        String path = sc.nextLine();

        File myFile = new File(path);

//        // Ensure the directory exists
//        myFile.getParentFile().mkdirs();

        // Write integers to the file as strings
        try (FileWriter fileWriter = new FileWriter(myFile)) {

            fileWriter.write("1\n");
            fileWriter.write("2\n");
            fileWriter.write("1\n");
            fileWriter.write("2\n");
            fileWriter.write("1\n");
            fileWriter.write("2\n");
            fileWriter.write("abc");

        }

        ReadFileExample readFileExample = new ReadFileExample();
        try {
            readFileExample.readFileText(path);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}