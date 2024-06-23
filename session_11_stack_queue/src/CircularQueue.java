class CircularQueue {
    private Node front, rear;

    public CircularQueue() {
        this.front = this.rear = null;
    }

    // Method to add an element to the queue
    public void enQueue(int value) {
        Node newNode = new Node(value);

        // If the queue is empty, set both front and rear to the new node
        if (this.front == null) {
            this.front = this.rear = newNode;
            this.rear.next = this.front; // Link to make it circular
        } else {
            // Otherwise, add the new node at the end and update the rear
            this.rear.next = newNode;
            this.rear = newNode;
            this.rear.next = this.front; // Link to make it circular
        }
    }

    // Method to remove an element from the queue
    public int deQueue() {
        // If the queue is empty, return -1 or throw an exception
        if (this.front == null) {
            System.out.println("Queue is empty");
            return -1; // Return -1 to indicate the queue is empty
        }

        int value; // To store the value to be dequeued

        // If the queue has only one node
        if (this.front == this.rear) {
            value = this.front.data;
            this.front = this.rear = null; // Queue becomes empty
        } else {
            // Store the value to be dequeued
            value = this.front.data;
            // Move the front pointer to the next node
            this.front = this.front.next;
            // Link the rear node to the new front to maintain the circular link
            this.rear.next = this.front;
        }

        return value;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return this.front == null;
    }

    // Method to display the queue elements
    public void displayQueue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = this.front;
        while (temp.next != this.front) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " "); // Print the last element
        System.out.println();
    }
}
