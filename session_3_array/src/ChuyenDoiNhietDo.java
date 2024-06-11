import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int luaChon;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celcius");
            System.out.println("2. Celcius to Fahrenheit");
            System.out.println("0. Exit");
            luaChon = scanner.nextInt();

            if (luaChon == 0) {
                break;
            }

            if (luaChon == 1) {
                System.out.println("Nhap nhiet do F: ");
                double fahrenheit = scanner.nextInt();
                System.out.println(fahrenheitToCelsius(fahrenheit));
            }
            if (luaChon == 2) {
                System.out.println("Nhap nhiet do C: ");
                double celsius = scanner.nextInt();
                System.out.println(celsiusToFahrenheit(celsius));
            }

        } while (luaChon != 0 || luaChon != 1 || luaChon != 2);
    }


    public static double celsiusToFahrenheit(double celsius) {
        double doF;
        doF = celsius * 9 / 5 + 32;
        return doF;

    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double doC;
        doC = (5.0 / 9) * (fahrenheit - 32);
        return doC;
    }

}
