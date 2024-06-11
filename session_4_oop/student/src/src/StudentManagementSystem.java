package src;

import java.util.Scanner;

public class StudentManagementSystem {
    // xay dung ung dung them sua xoa SInh vien

    protected src.Student[] listStudent;
    protected int limit;
    protected int size;

    public StudentManagementSystem(int limit) {
        this.listStudent = new src.Student[limit];
        this.limit = limit;
        this.size = 0;
    }

    public void addStudent(src.Student student) {
        if (this.size == this.limit) {
            System.out.println("Student list is full");
        } else {
            listStudent[this.size] = student;
            this.size++;
        }
    }

    public void addStudentFromKeyboard(Scanner scanner) {
        if (this.size == this.limit) {
            System.out.println("Student list is full");
            return;
        }

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student email: ");
        String email = scanner.nextLine();
        System.out.print("Enter student mobile: ");
        String mobile = scanner.nextLine();
        System.out.print("Enter student GPA: ");
        double GPA = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Student student = new Student(id, name, email, mobile, GPA);
        addStudent(student);
    }

    public void editStudentFromKeyboard(Scanner scanner) {
        System.out.print("Enter student ID to edit: ");
        String id = scanner.nextLine();
        Student student = findStudentById(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter new name (leave blank to keep current): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            student.setName(name);
        }

        System.out.print("Enter new email (leave blank to keep current): ");
        String email = scanner.nextLine();
        if (!email.isEmpty()) {
            student.setEmail(email);
        }

        System.out.print("Enter new mobile (leave blank to keep current): ");
        String mobile = scanner.nextLine();
        if (!mobile.isEmpty()) {
            student.setMobile(mobile);
        }

        System.out.print("Enter new GPA (leave blank to keep current): ");
        String gpaStr = scanner.nextLine();
        if (!gpaStr.isEmpty()) {
            double GPA = Double.parseDouble(gpaStr);
            student.setGPA(GPA);
        }

        System.out.println("Student updated successfully.");
    }

    public void deleteStudentFromKeyboard(Scanner scanner) {
        System.out.print("Enter student ID to delete: ");
        String id = scanner.nextLine();
        int index = findStudentIndexById(id);

        if (index == -1) {
            System.out.println("Student not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            listStudent[i] = listStudent[i + 1];
        }

        listStudent[size - 1] = null;
        size--;
        System.out.println("Student deleted successfully.");
    }

    public void showStudent() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(listStudent[i]);
        }
    }

    private Student findStudentById(String id) {
        for (int i = 0; i < size; i++) {
            if (listStudent[i].getId().equals(id)) {
                return listStudent[i];
            }
        }
        return null;
    }

    private int findStudentIndexById(String id) {
        for (int i = 0; i < size; i++) {
            if (listStudent[i].getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
