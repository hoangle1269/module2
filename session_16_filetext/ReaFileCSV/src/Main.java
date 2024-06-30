import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Enter choice number!");
                System.out.println("1. Add country");
                System.out.println("2. Show list country");
                System.out.println("3. Delete country");
                System.out.println("4. Update country");
                System.out.println("5. Exit");
                int choice = Integer.parseInt(scanner.nextLine());
//                if (choice == 5) { // gây khó hiểu
//                    break;
//                }
                switch (choice) {
                    case 1:
                        CountryInfoManager.createCountry();
                        break;
                    case 2:
                        CountryInfoManager.showListCountry();
                        break;
                    case 3:
                        CountryInfoManager.deleteCountry();
                        break;
                    case 4:
                        CountryInfoManager.updateCountry();
                        break;
                    case 5:
                        CountryInfoManager.exit();
                        break;
                    default:
                        System.out.println("Invalid number! Input again!");

                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid number! Input again!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}