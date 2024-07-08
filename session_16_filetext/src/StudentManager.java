import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private static final String FILE_PATH = "session_16_filetext/studentdata.txt";
    private static final File MY_FILE = new File(FILE_PATH);
    private static final Scanner SCANNER = new Scanner(System.in);

    public StudentManager() {
    }

    public static void addStudent() throws CustomException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(MY_FILE, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            System.out.println("----------Enter student information------");
            System.out.println("Enter id: ");
            int id = Integer.parseInt(SCANNER.nextLine());
            System.out.println("Enter name: ");
            String name = SCANNER.nextLine();
            System.out.println("Enter age: ");
            int age = Integer.parseInt(SCANNER.nextLine());

            Student student = new Student(id, name, age);
            // luu vao file
            bufferedWriter.write(student.getId() + ", " + student.getName() + ", " + student.getAge());
            bufferedWriter.newLine();
            // dong file va luu data
        } catch (NumberFormatException e) {
            throw new CustomException("Please input number!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void showListStudent() throws IOException {
        FileReader fileReader = new FileReader(MY_FILE);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            // chuyen String ve array su dung split()
            String[] data = line.split(", ");
            int idStudent = Integer.parseInt(data[0]);
            String nameStudent = data[1];
            int ageStudent = Integer.parseInt(data[2]);
            Student student = new Student(idStudent, nameStudent, ageStudent);
            System.out.println(student);
        }
        bufferedReader.close();
    }

    public static void deleteStudent() throws Exception {
        // code xoa student
        System.out.println("Enter id student delete: ");
        int idStudentDelete = Integer.parseInt(SCANNER.nextLine());
        System.out.println(idStudentDelete);
        // create a list students from file
        List<Student> students = getStudentList();
        Student studentDelete = null;
        // delete student trong list students
        for (Student item : students) {
            if (item.getId() == idStudentDelete) {
                studentDelete = item;
                break;
            }
        }

        if (studentDelete == null) {
            throw new Exception("Student deleted not found");
        }

        students.remove(studentDelete);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_FILE));
        // write data to file after delete
        for (Student student : students) {
            String dataStudent = student.getId() + "," + student.getName();
            bufferedWriter.write(dataStudent);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    private static List<Student> getStudentList() throws IOException {
        List<Student> students = new ArrayList<Student>();
//        // read data from file
//        FileReader fileReader = new FileReader(MY_FILE);
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//        String line = "";
//        while ((line = bufferedReader.readLine()) != null) {
//            String[] text = line.split(",");
//            int id = Integer.parseInt(text[0]);
//            String name = text[1];
//            int age = Integer.parseInt(text[2]);
//            Student student = new Student(id, name, age);
//            students.add(student);
//        }
        return students;
    }

    public static void updateStudent() throws Exception {

        System.out.println("Enter id of student to update: ");
        int id = Integer.parseInt(SCANNER.nextLine());

        List<Student> students = getStudentList();

        Student studentUpdate = null;
        for (Student item : students) {
            if (item.getId() == id) {
                studentUpdate = item;
                break;
            }
        }

        if (studentUpdate == null) {
            throw new Exception("Student not found");
        }

        System.out.println("Enter new name: ");
        String newName = SCANNER.nextLine();
        int newAge = SCANNER.nextInt();
        studentUpdate.setId(id);
        studentUpdate.setName(newName);
        studentUpdate.setAge(newAge);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_FILE));
        for (Student student : students) {
            bufferedWriter.write(student.getId() + "," + student.getName());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }

    public static void importStudentFromFile() throws Exception {

        System.out.println("Enter the path of the file to import: ");
        String importFilePath = SCANNER.nextLine();
        File importFile = new File(importFilePath);

        if (!importFile.exists()) {
            throw new IOException("File not found");
        }

        FileReader fileReader = new FileReader(importFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(MY_FILE, true));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

    public static void exportStudentFromFile() throws Exception {
        System.out.println("Enter the path of the file to export: ");
        String exportFilePath = SCANNER.nextLine();
        File exportFile = new File(exportFilePath);

        FileReader fileReader = new FileReader(MY_FILE);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(exportFile));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

    public static void exit() throws Exception {
        System.out.println("Exiting...");
        System.exit(0);
    }

}