public class Main {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);

        System.out.println("Queue after enQueue operations:");
        queue.displayQueue();

        System.out.println("Dequeued element: " + queue.deQueue());
        System.out.println("Queue after one deQueue operation:");
        queue.displayQueue();

        queue.enQueue(50);
        System.out.println("Queue after enQueue operation:");
        queue.displayQueue();

        System.out.println("Dequeued element: " + queue.deQueue());
        System.out.println("Dequeued element: " + queue.deQueue());
        System.out.println("Queue after multiple deQueue operations:");
        queue.displayQueue();
    }
}
