public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(0);
        list.addLast(4);

        System.out.println("Original List:");
        list.printList(); // Output: 0 1 2 3 4

        list.remove(2);
        System.out.println("After removing element at index 2:");
        list.printList(); // Output: 0 1 3 4

        list.remove((Integer) 3);
        System.out.println("After removing element 3:");
        list.printList(); // Output: 0 1 4

        System.out.println("Element at index 1: " + list.get(1)); // Output: 1

        System.out.println("List size: " + list.size()); // Output: 3

        MyLinkedList<Integer> clonedList = list.clone();
        System.out.println("Cloned List:");
        clonedList.printList(); // Output: 0 1 4

        System.out.println("List contains 1: " + list.contains(1)); // Output: true
        System.out.println("Index of element 4: " + list.indexOf(4)); // Output: 2
    }
}
