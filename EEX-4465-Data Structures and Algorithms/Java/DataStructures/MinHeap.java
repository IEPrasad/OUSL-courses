public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    private int parent(int i) { return (i - 1) / 2; }
    private int left(int i) { return 2 * i + 1; }
    private int right(int i) { return 2 * i + 2; }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    // Insert value
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap full");
            return;
        }

        heap[size] = value;
        int current = size;
        size++;

        while (current != 0 && heap[parent(current)] > heap[current]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Get min
    public int getMin() {
        if (size == 0) return -1;
        return heap[0];
    }

    // Remove min
    public int extractMin() {
        if (size == 0) return -1;

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapify(0);
        return min;
    }

    // Heapify down
    private void heapify(int i) {
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && heap[l] < heap[smallest]) smallest = l;
        if (r < size && heap[r] < heap[smallest]) smallest = r;

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    // Print heap
    public void printHeap() {
        System.out.print("MinHeap: ");
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(30);
        minHeap.insert(20);
        minHeap.insert(10);
        minHeap.insert(40);
        minHeap.insert(5);

        minHeap.printHeap();
        System.out.println("Min: " + minHeap.getMin());
        minHeap.extractMin();
        minHeap.printHeap();
    }
}
