import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height");
        height = scanner.nextFloat();

        float area = height * width;
        float perimeter = 2 * (height + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

    }
}
