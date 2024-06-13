import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args) {
        int[] array; // khai bao
        Scanner scanner = new Scanner(System.in);
        int soPhanTu;
        do {
            System.out.println("Nhap so phan tu cua mang: ");
            soPhanTu = scanner.nextInt();
        } while (soPhanTu < 0 || soPhanTu > 20);

        int phanTu;
        array = new int[soPhanTu]; //assign size cho array (khoi tao)
        int i;

        for (i = 0; i < soPhanTu; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + " cua mang: ");
            phanTu = scanner.nextInt();
            array[i] = phanTu;
        }

        for (int ele : array) {
            System.out.println("Phan tu trong mang: " + ele);
        }

        System.out.println("Phan tu nho nhat: " + minValue(array));


    }



    public static int minValue(int[] array) {
        int min = array[0];
        array = new int[0];
        for (int j : array) {
            min = array[0];
            if (min > j) {
                min = j;
            }
        }
        return min;

    }
}
