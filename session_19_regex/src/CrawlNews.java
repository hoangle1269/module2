import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");

            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();

            // remove all new line
            content = content.replaceAll("\\n+", "");

            // regex
            Pattern pattern = Pattern.compile("dt-text-black-mine\"(.*?)>(.*?)</a>");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(2));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
