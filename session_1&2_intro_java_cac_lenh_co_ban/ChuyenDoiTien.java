import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        int tyGia = 26000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao $: ");
        int soTien = scanner.nextInt();
        int soTienVND = soTien * tyGia;
        System.out.println("So tien quy doi: " + soTienVND + "VND");
    }

}
