import java.util.Scanner;

public class ExerciseOnClass {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // viet chuong trinh nhap vao tu ban phim 2 so a, b
        // tinh tong cua cac so tu a -> b

        Scanner scanner = new Scanner(System.in);
        int a, b;

        do {
            System.out.println("Enter a: ");
            a = scanner.nextInt();
            System.out.println("Enter b: ");
            b = scanner.nextInt();
        } while (a >= b);

        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }

        System.out.println("Tong cac so tu " + a + " den " + b + " la: " + sum);

    }
}
