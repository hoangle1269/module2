

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyList<Integer> myList = new MyList<>();


        myList.addLast(1);
        myList.addLast(2);
        myList.addLast(3);
        myList.addLast(4);
        myList.addLast(5);
        myList.addLast(6);


        myList.printList();
    }
}