import java.util.*;

public class KruskalAlgorithm {
    static class Edge implements Comparable<Edge> {
        int u, v, weight;
        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }

        public int compareTo(Edge other) {
            return this.weight - other.weight;
        }
    }

    static class DisjointSet {
        int[] parent;

        DisjointSet(int n) {
            parent = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int x) {
            if (x != parent[x])
                parent[x] = find(parent[x]);
            return parent[x];
        }

        void union(int a, int b) {
            int rootA = find(a);
            int rootB = find(b);
            if (rootA != rootB)
                parent[rootA] = rootB;
        }
    }

    public static void main(String[] args) {
        int vertices = 6;
        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 4));
        edges.add(new Edge(0, 2, 4));
        edges.add(new Edge(1, 2, 2));
        edges.add(new Edge(1, 3, 5));
        edges.add(new Edge(2, 3, 5));
        edges.add(new Edge(2, 4, 11));
        edges.add(new Edge(3, 5, 2));
        edges.add(new Edge(4, 5, 1));

        Collections.sort(edges);

        DisjointSet ds = new DisjointSet(vertices);

        int mstCost = 0;
        System.out.println("Edges in Minimum Spanning Tree:");
        for (Edge e : edges) {
            if (ds.find(e.u) != ds.find(e.v)) {
                ds.union(e.u, e.v);
                mstCost += e.weight;
                System.out.println(e.u + " — " + e.v + " = " + e.weight);
            }
        }

        System.out.println("Total MST Cost: " + mstCost);
    }
}
