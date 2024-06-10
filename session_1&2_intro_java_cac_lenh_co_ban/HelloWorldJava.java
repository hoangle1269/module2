import java.util.Scanner;

public class HelloWorldJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //lay du lieu tu ban phim
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        System.out.println("C: " + c);

        // Viet chuong trinh gpt bac 2
        // ax2 + bx + c = 0

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                }
                else
                    System.out.println("Phuong trinh vo ly");
            }
            else {
                int x = -c / b;
                System.out.println("Phuong trinh co nghiem x = " + x);
            }
        }
        else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            else if (delta == 0) {
                int x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x);
            }
            else {
                int x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
                int x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}