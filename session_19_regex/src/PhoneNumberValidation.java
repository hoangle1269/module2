import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    private static final Pattern pattern = Pattern.compile("\\((84)\\)-\\(0[0-9]{9}\\)");

    public boolean phoneNumberValidate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
