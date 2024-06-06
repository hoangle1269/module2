import java.util.Scanner;

public class tinhNgayTrongThang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao thang: ");
        int thang = scanner.nextInt();
        System.out.println("Nhap vao nam: ");
        int nam = scanner.nextInt();

        int ngay = 0;

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                ngay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                ngay = 30;
                break;
            case 2:
                if (nam % 4 == 0) {
                    ngay = 29;
                } else {
                    ngay = 28;
                }
                break;
        }
        System.out.println("Tháng " + thang + " có " + ngay + " ngày");
    }
}
