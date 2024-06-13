import java.util.Scanner;

public class MeasureBMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao (m): ");
        double chieuCao = scanner.nextDouble();
        System.out.println("Nhập cân nặng (kg):");
        double canNang = scanner.nextDouble();

        double bmi = canNang / (chieuCao * chieuCao);
        System.out.println(bmi);
        if (bmi < 18.5) {
            System.out.println("Thiếu cân");
        } else if (bmi < 25) {
            System.out.println("Bình thường");
        } else if (bmi < 30) {
            System.out.println("Thừa cân");
        } else {
            System.out.println("Béo phì");
        }
    }
}
