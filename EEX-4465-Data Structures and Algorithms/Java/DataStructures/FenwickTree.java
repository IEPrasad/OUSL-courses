public class FenwickTree {
    private int[] tree;
    private int size;

    public FenwickTree(int n) {
        size = n;
        tree = new int[n + 1];
    }

    // Update at index by value
    public void update(int index, int value) {
        index++; // 1-based indexing
        while (index <= size) {
            tree[index] += value;
            index += index & -index;
        }
    }

    // Prefix sum up to index
    public int query(int index) {
        index++; // 1-based indexing
        int sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= index & -index;
        }
        return sum;
    }

    // Range sum [l, r]
    public int rangeQuery(int l, int r) {
        return query(r) - query(l - 1);
    }

    // Main
    public static void main(String[] args) {
        FenwickTree ft = new FenwickTree(10);
        ft.update(1, 5);
        ft.update(2, 3);
        ft.update(5, 2);

        System.out.println("Sum [1, 5]: " + ft.rangeQuery(1, 5)); // Output: 10
        System.out.println("Sum [2, 2]: " + ft.rangeQuery(2, 2)); // Output: 3
    }
}
