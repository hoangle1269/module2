import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        System.out.println("Nhap ten nhan vat!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Xin chao " + name + "!");
        System.out.println("Xin chao " + args[0] + "!");
    }
}
