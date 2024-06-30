import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<User> list = new ArrayList<>();

        list.add(new User("John", "john@gmail.com", RollConst.ROLE_ADMIN));
        list.add(new User("Lee", "lee@gmail.com", RollConst.ROLE_ADMIN));
        list.add(new User("Steve", "steve@gmail.com", RollConst.ROLE_USER));
        list.add(new User("Tony", "tony@gmail.com", RollConst.ROLE_USER));


        int countAdmin = 0;
        int countUser = 0;
        for (User user : list) {
            if (user.getRole() == RollConst.ROLE_ADMIN) {
                countAdmin++;
            } else if (user.getRole() == RollConst.ROLE_USER) {
                countUser++;
            }
        }
        System.out.println(countAdmin);
        System.out.println(countUser);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to search in emails: ");
        String x = scanner.nextLine();

        for (User user : list) {
            if (user.getEmail().contains(x)) {
                System.out.println(user.getName());
            }
        }

        scanner.close();


    }

}
