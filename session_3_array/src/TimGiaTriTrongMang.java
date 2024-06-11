import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camilla", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);


        boolean isExist = false;

        do {
            System.out.println("Enter a student's name");
            String input_name = scanner.nextLine();
            for (int i = 0; i < students.length; i++) {
                if (students[i].equals(input_name)) {
                    System.out.println("Position of student " + input_name + " is: " + i);
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                System.out.println("Not found " + input_name + " in the list");
            }
        } while (true);


    }
}
