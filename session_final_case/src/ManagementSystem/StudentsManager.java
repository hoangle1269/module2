package ManagementSystem;

import Objects.Student;

import java.io.*;
import java.util.*;

public class StudentsManager {
    private static final String FILE_NAME = "C:\\Users\\hoang\\IdeaProjects\\Module2.1\\session_final_case\\students.csv";
    private List<Student> students;

    public StudentsManager() {
        this.students = loadStudents();
    }

    private List<Student> loadStudents() {
        List<Student> studentList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                studentList.add(Student.fromCSV(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    public void saveStudents() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student student : students) {
                bw.write(student.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student student) {
        students.add(student);
        saveStudents();
    }

    public List<Student> getStudents() {
        return students;
    }
}

