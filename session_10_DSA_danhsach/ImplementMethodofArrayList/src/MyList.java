import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    // Constructor with size parameter
    public MyList(int size) {
        this.size = size;
        elements = new Object[size];
    }

    // Default constructor
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E oldValue = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null; // clear to let GC do its work
        size--;
        return oldValue;
    }

    int size() {
        return size;
    }

    MyList<E> cloneArray() {
        MyList<E> clonedList = new MyList<>(size);
        for (int i = 0; i < size; i++) {
            clonedList.elements[i] = elements[i];
        }
        clonedList.size = size;
        return clonedList;
    }

    boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    int indexOf(E o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void addLast(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
    }

    void ensureCapacity(int minCapacity) {
        int oldCapacity = elements.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }
}
