import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        double soTienBanDau = 1.0;
        double thoiGian = 1;
        double laiSuat = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tien ban dau: ");
        soTienBanDau = scanner.nextDouble();
        System.out.println("Nhap vao lai suat: ");
        laiSuat = scanner.nextDouble();
        System.out.println("Nhap vao so thang gui: ");
        thoiGian = scanner.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < thoiGian; i++){
            totalInterest += soTienBanDau * (laiSuat/100)/12 * thoiGian;
        }

        System.out.println("So tien lai la: " + totalInterest);
    }
}
