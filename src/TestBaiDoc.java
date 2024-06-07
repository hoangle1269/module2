import java.util.Scanner;

public class TestBaiDoc {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password;
        do {
//            System.out.println("Enter password: ");
            password = sc.nextLine();
        } while (!password.equals("vung oi mo ra"));
    }
}
