public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student.change();

        Student s1 = new Student(123, "Steve");
        Student s2 = new Student(125, "Tony");
        Student s3 = new Student(126, "Hulk");

        s1.display();
        s2.display();
        s3.display();

    }
}