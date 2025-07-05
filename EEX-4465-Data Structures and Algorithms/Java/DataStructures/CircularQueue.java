public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    // Peek
    public int peek() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    // Check if empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if full
    public boolean isFull() {
        return size == capacity;
    }

    // Print queue
    public void printQueue() {
        System.out.print("Circular Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);

        cq.printQueue(); // 10 20 30 40 50

        cq.dequeue();
        cq.dequeue();

        cq.printQueue(); // 30 40 50

        cq.enqueue(60);
        cq.enqueue(70);
        cq.printQueue(); // 30 40 50 60 70
    }
}
