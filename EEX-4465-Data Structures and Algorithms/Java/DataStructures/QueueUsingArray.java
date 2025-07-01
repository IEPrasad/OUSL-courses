public class QueueUsingArray {
    private int[] queue;
    private int front, rear, size, capacity;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = size = 0;
        rear = -1;
    }

    // Enqueue
    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        int removed = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    // Peek front
    public int peek() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Print Queue
    public void printQueue() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue(); // 10 20 30

        queue.dequeue();
        queue.printQueue(); // 20 30

        System.out.println("Front: " + queue.peek());
    }
}
