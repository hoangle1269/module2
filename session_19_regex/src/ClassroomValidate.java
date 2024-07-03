import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassroomValidate {
    private static final Pattern pattern = Pattern.compile("^[CAP][0-9]{4}[GHIK]$");

    public boolean classRoomValidate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
