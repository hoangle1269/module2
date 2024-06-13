public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student = new Student();
        Student student2 = new Student("James", "CGXX");

        System.out.println(student.getClasses());
        System.out.println(student.getName());
        System.out.println(student2.getClasses());
        System.out.println(student2.getName());

        Student student3 = new Student();

        student3.setName("Alice");
        student3.setClasses("CG06");
        System.out.println(student3.getClasses());
        System.out.println(student3.getName());





    }
}