import java.util.Scanner;

public class SimpleEquation {
    public static void main(String[] args) {
        //giai phuong trinh ax + b = 0

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }

        if (a != 0) {
            int x = -b / a;
            System.out.println("Phuong trinh co nghiem x = " + x);
        }

    }
}
