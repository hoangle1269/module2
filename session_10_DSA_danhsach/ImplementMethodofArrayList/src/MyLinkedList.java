public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes;

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    // Method to add an element at the end
    public void add(E element) {
        if (head == null) {
            head = new Node<>(element);
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<>(element);
        }
        numNodes++;
    }

    // Method to add an element at the beginning
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    // Method to add an element at the end
    public void addLast(E element) {
        add(element);
    }

    // Method to remove an element at a specific index
    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> temp = head;
        if (index == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            E removedData = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
            return removedData;
        }
        numNodes--;
        return temp.data;
    }

    // Method to remove a specific element
    public boolean remove(Object o) {
        if (head == null) return false;

        if (head.data.equals(o)) {
            head = head.next;
            numNodes--;
            return true;
        }

        Node<E> temp = head;
        while (temp.next != null && !temp.next.data.equals(o)) {
            temp = temp.next;
        }

        if (temp.next == null) return false;

        temp.next = temp.next.next;
        numNodes--;
        return true;
    }

    // Method to get an element at a specific index
    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Method to get the size of the list
    public int size() {
        return numNodes;
    }

    // Method to print the list
    public void printList() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to clone the list
    @Override
    public MyLinkedList<E> clone() {
        MyLinkedList<E> clonedList = new MyLinkedList<>();
        Node<E> temp = head;
        while (temp != null) {
            clonedList.add(temp.data);
            temp = temp.next;
        }
        return clonedList;
    }

    // Method to check if the list contains an element
    public boolean contains(Object o) {
        Node<E> temp = head;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Method to get the index of an element
    public int indexOf(Object o) {
        Node<E> temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
}
