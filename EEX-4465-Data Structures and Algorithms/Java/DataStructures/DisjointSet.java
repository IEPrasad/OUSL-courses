public class DisjointSet {
    private int[] parent;
    private int[] rank;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i; // Every node is its own parent at start
        }
    }

    // Find with path compression
    public int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    // Union by rank
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) return;

        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }

    // Check if in same set
    public boolean isConnected(int x, int y) {
        return find(x) == find(y);
    }

    // Main
    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(6);
        ds.union(0, 1);
        ds.union(2, 3);
        ds.union(1, 2);

        System.out.println("0 and 3 connected? " + ds.isConnected(0, 3)); // true
        System.out.println("4 and 5 connected? " + ds.isConnected(4, 5)); // false
    }
}
