import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
//            System.out.println("Input string: ");
//            String stringEmail = scanner.nextLine();
//            System.out.println("Input date: ");
//            String stringDate = scanner.nextLine();
//            System.out.println("Input hour: ");
//            String stringHour = scanner.nextLine();
//            System.out.println("Input visa number: ");
//            String visaNumber = scanner.nextLine();

            // Check email
            String regexEmail = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$";
            Pattern patternEmail = Pattern.compile(regexEmail);

            Matcher matcherEmail = patternEmail.matcher("stringEmail");
            boolean matchEmail = matcherEmail.matches();

            // Check date
            Pattern patternDate = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])(-|/)(0[1-9]|1[0-2])(-|/)(19|20)\\d{2}$");

            Matcher matcherDate = patternDate.matcher("00/02/2000");
            boolean matchDate = matcherDate.matches();

            // Check hour
            Pattern patternHour = Pattern.compile("^([01][0-9]|2[0-3])(-|:)([0-5][0-9])$");

            Matcher matcherHour = patternHour.matcher("stringHour");
            boolean matchHour = matcherHour.matches();

            // Check visa number
            Pattern patternVisa = Pattern.compile("^(\\d{4}(-| )){3}\\d{4}$");

            Matcher matcherVisa = patternVisa.matcher("1234-1234-1234-1234");
            boolean matchVisa = matcherVisa.matches();

            System.out.println("Email valid: " + matchEmail);
            System.out.println("Date valid: " + matchDate);
            System.out.println("Hour valid: " + matchHour);
            System.out.println("Visa number valid: " + matchVisa);

            ClassroomValidate classroomValidator = new ClassroomValidate();

            boolean isValid1 = classroomValidator.classRoomValidate("C0223G");
            System.out.println("C0223G valid: " + isValid1);
            boolean isValid2 = classroomValidator.classRoomValidate("A0323K");
            System.out.println("A0323K valid: " + isValid2);
            boolean isValid3 = classroomValidator.classRoomValidate("M0318G");
            System.out.println("M0318G valid: " + isValid3);
            boolean isValid4 = classroomValidator.classRoomValidate("P0323A");
            System.out.println("P0323A valid: " + isValid4);

            PhoneNumberValidation phoneNumberValidator = new PhoneNumberValidation();

            boolean checkPN = phoneNumberValidator.phoneNumberValidate( "(84)-(0978489648)");
            System.out.println(checkPN);
            boolean checkWPN = phoneNumberValidator.phoneNumberValidate("(a8)-(22222222)");
            System.out.println(checkWPN);
            boolean checkWPN1 = phoneNumberValidator.phoneNumberValidate("(84)-(22b22222)");
            System.out.println(checkWPN1);
            boolean checkWPN2 = phoneNumberValidator.phoneNumberValidate("(84)-(9978489648)");
            System.out.println(checkWPN2);

            // Break condition (optional)
            System.out.println("Continue? (yes/no): ");
            String continueInput = scanner.nextLine();
            if (!continueInput.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
