import java.util.*;

public class DijkstraAlgorithm {
    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    private int vertices;
    private List<List<Edge>> adj;

    public DijkstraAlgorithm(int v) {
        vertices = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());
    }

    // Add edge (u → v, weight)
    public void addEdge(int u, int v, int w) {
        adj.get(u).add(new Edge(v, w));
    }

    // Dijkstra's algorithm
    public void dijkstra(int src) {
        int[] dist = new int[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{src, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0], d = current[1];

            if (d > dist[u]) continue;

            for (Edge edge : adj.get(u)) {
                if (dist[u] + edge.weight < dist[edge.to]) {
                    dist[edge.to] = dist[u] + edge.weight;
                    pq.offer(new int[]{edge.to, dist[edge.to]});
                }
            }
        }

        System.out.println("Shortest distances from node " + src + ":");
        for (int i = 0; i < vertices; i++) {
            System.out.println("To " + i + " → " + dist[i]);
        }
    }

    public static void main(String[] args) {
        DijkstraAlgorithm g = new DijkstraAlgorithm(6);
        g.addEdge(0, 1, 4);
        g.addEdge(0, 2, 2);
        g.addEdge(1, 2, 5);
        g.addEdge(1, 3, 10);
        g.addEdge(2, 4, 3);
        g.addEdge(4, 3, 4);
        g.addEdge(3, 5, 11);

        g.dijkstra(0); // From node 0
    }
}
