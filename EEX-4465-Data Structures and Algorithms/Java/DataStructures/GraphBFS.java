import java.util.*;

public class GraphBFS {    private int vertices;
  private List<List<Integer>> adj;

  public GraphBFS(int v) {
    vertices = v;
    adj = new ArrayList <>();
    for (int i = 0; i < v; i++)
      adj.add(new ArrayList<>());
  }

  // Add edge 
  public void addEdge(int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u); // For undirected graph
  }

  // BFS traversal from a given start node 
  public void bfs(int start) {
    boolean[] visited = new boolean[vertices];
    Queue<Integer> queue = new LinkedList<>();

    visited[start] = true;
    queue.offer(start);

    System.out.print("BFS: ");
    while (!queue.isEmpty()) {
      int node = queue.poll();
      System.out.print(node + " ");

      for (int neighbor : adj.get(node)) {
        if (!visited[neighbor]) {
          visited[neighbor] = true;
          queue.offer(neighbor);
        }
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    GraphBFS g = new GraphBFS(6);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 3);
    g.addEdge(2, 4);
    g.addEdge(3, 5);

    g.bfs(0); // Output: 0 1 2 3 4 5
  }
}
