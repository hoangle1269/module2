import java.sql.Array;
import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
//        int[] arr = new int[6];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Enter item index = " + i + ": ");
//            int value = Integer.parseInt(scanner.nextLine());
//            arr[i] = value;
//        }
//
//        // thao tac voi mang
//        // duyet mang sd while
//
//        int index = 0;
//        while (index < arr.length) {
//            System.out.println(arr[index]);
//            index++;
//        }
//
//        // duyet mang sd for
//        int l = arr.length;
//        for (int i = 0; i < l; i++) {
//            System.out.println(arr[i]);
//        }
//
//        // duyet mang sd foreach
//
//        for (int number : arr) {
//            System.out.println(while);
//        }
//
        // tùy vào yêu cầu thì sử dụng vòng lặp khác nhau

        // thêm một phần tử vào mảng

//        int[] arr = {1, 2, 3, 4};
//        int l = arr.length;
//
//        int[] arr1 = new int[l + 1];
//
//
//        for (int i = 0; i < l; i++) {
//            arr1[i] = arr[i];
//        }
//
//        arr1[l] = 5;
//
//        // gán lại
//
//        arr = arr1;
//
//        for (int j : arr) {
//            System.out.println(j);
//        }
//
        // xóa một phần tử trong mảng

        int[] arr = {1, 2, 3, 4, 5, 6};

        int l = arr.length;

        int[] arr1 = new int[l - 1];

        int IndexRemove = 2;

        for (int i = 0; i < l; i++) {
            if (i < IndexRemove) {
                arr1[i] = arr[i];
            } else if (i == IndexRemove) {
                continue;
            } else {
                arr1[i - 1] = arr[i];
            }
        }

        arr = arr1;

        for (int j : arr) {
            System.out.println(j);
        }


    }
}
