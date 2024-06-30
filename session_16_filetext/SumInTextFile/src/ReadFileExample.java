import java.io.*;

public class ReadFileExample {
    public void readFileText(String path) throws IOException {
        try {
            File myFile = new File(path);

            if (!myFile.exists()) {
                throw new FileNotFoundException("File not found");
            }

            BufferedReader br = new BufferedReader(new FileReader(myFile));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum: " + sum);
        } catch (Exception e) {
            System.err.println("File not exist or fault content!");
        }
    }
}