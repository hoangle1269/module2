import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student student0 = new Student("Steve", 95, "23, TT11");
        Student student1 = new Student("Tony", 44, "20, TT12");
        Student student2 = new Student("Sen", 25, "22, TT15");
        Student student3 = new Student("Sven", 55, "26, TT11");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student0);
        studentMap.put(2, student1);
        studentMap.put(3, student2);
        studentMap.put(4, student3);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student0);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student student : students) {
            System.out.println(student.toString());
        }


        Student student00 = new Student("Kien", 30, "HT");
        Student student01 = new Student("Nam", 26, "HN");
        Student student02 = new Student("Anh", 38, "HT");
        Student student03 = new Student("Tung", 38, "HT");

        List<Student> listStudent = new ArrayList<Student>();
        listStudent.add(student00);
        listStudent.add(student01);
        listStudent.add(student02);
        listStudent.add(student03);


        System.out.println("List as input");

        for (Student st : listStudent) {
            System.out.println(st.toString());
        }

        Collections.sort(listStudent);
        System.out.println("List as abc");
        for (Student st : listStudent) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(listStudent, ageComparator);

        System.out.println("Compare age of student");
        for (Student st : listStudent) {
            System.out.println(st.toString());
        }

    }
}
