public class MaxHeap {
  private int[] heap[] heap;
  private int size;
  private int capacity;

  // constructor 
  public MaxHeap(int capacity) {
    this.capacity = capacity;
    this.size = 0;
    heap = new int[capacity];
  }

  // Get parent, left, right indexes
  private int parent (int i) { return (i - 1) / 2; }
  private int leftChild (int i) { return 2 * i + 1; }
  private int rightChild (int i) { return 2 * i + 2; }

  // Swap helper
  private void swap(int i, int j) {
    int temp = heap[i];
    heap[i] = heap[j];
    heap[j] = temp;
  }

  // Insert element 
  public void insert(int value) {
    if (size == capacity) {
      System.out.println("Heap is full");
      return;
    }

    heap[size] = value;
    int current = size;
    size++;

    while (current != 0 && heap[parent(current)] < heap[current]) {
      swap(current, parent(current));
      current = parent(current);
    }
  }

  // Get max (root)
  public int getMax() {
    if (size == 0) {
      throw new IllegalStateException("Heap is empty");
    }
    return heap[0];
  }

  // Remove max and re-heapify
  public int extractMax() {
    if (size == 0) {
      throw new IllegalStateException("Heap is empty");
    } 
    
    int max = heap[0];
    heap[0] = heap[size - 1];
    size--;

    heapify(0);
    return max;
  }

  // Heapify down
  private void heapify(int i) {
    int largest = i;
    int left = leftChild(i);
    int right = rightChild(i);

    if (left < size && heap[left] > heap[largest]) {
      largest = left;
    }

    if (right < size && heap[right] > heap[largest]) {
      largest = right;
    }

    if (largest != i) {
      swap(i, largest);
      heapify(largest);
    }
  }

  // Print heap
  public void printHeap() {
    for (int i = 0; i < size; i++) {
      System.out.println(heap[i] + " ");
    }
    System.out.println();
  }

  // Main method for testing
  public static void main(String[] args) {
    MaxHeap maxHeap = new MaxHeap(10);
    maxHeap.insert(25);
    maxHeap.insert(30);
    maxHeap.insert(10);
    maxHeap.insert(50);
    maxHeap.insert(60);
    maxHeap.insert(15);

    maxHeap.printHeap();

    System.out.println("Max Value: " + maxHeap.getMax());
    System.out.println("Extracted Max: " + maxHeap.extractMax());
    maxHeap.printHeap();
  }
} 
