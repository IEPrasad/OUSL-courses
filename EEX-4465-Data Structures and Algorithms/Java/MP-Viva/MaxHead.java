import java.util.*;

class MaxHeap {
    private List<Emergency> heap = new ArrayList<>();

    private int compare(Emergency a, Emergency b) {
        if (a.severity != b.severity)
            return Integer.compare(b.severity, a.severity);
        return Integer.compare(a.timeReported, b.timeReported);
    }

    public void insert(Emergency e) {
        heap.add(e);
        int i = heap.size() - 1;
        while (i > 0 && compare(heap.get(i), heap.get((i - 1) / 2)) < 0) {
            Collections.swap(heap, i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public Emergency extractMax() {
        if (heap.isEmpty()) return null;
        Emergency root = heap.get(0);
        Emergency last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            heapify(0);
        }
        return root;
    }

    private void heapify(int i) {
        int left = 2*i + 1, right = 2*i + 2, largest = i;
        if (left < heap.size() && compare(heap.get(left), heap.get(largest)) < 0)
            largest = left;
        if (right < heap.size() && compare(heap.get(right), heap.get(largest)) < 0)
            largest = right;
        if (largest != i) {
            Collections.swap(heap, i, largest);
            heapify(largest);
        }
    }
}
