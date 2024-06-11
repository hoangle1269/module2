import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap vao b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhap vao c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double delta = quadraticEquation.getDiscriminant();
        double r1 = quadraticEquation.getRoot1();
        double r2 = quadraticEquation.getRoot2();

        if (delta > 0) {
            System.out.println("The equation has 2 roots: ");
            System.out.println(r1 + " & ");
            System.out.println(r2);
        } else if (delta == 0) {
            System.out.println("The equation has 1 root: " + r1);
        } else
            System.out.println("The equation has no roots!");
    }
}