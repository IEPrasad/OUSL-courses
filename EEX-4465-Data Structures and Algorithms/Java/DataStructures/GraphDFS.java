 import java.util.*;

 public class GraphDFS {
  private int vertices;
  private List<List<Integer>> adj;

  public GraphDFS(int v) {
    vertices = v;
    adj = new ArrayList<>();
    for (int i = 0; i < v; i ++)
      adj.add(new ArrayList<>());
  }

  // Add edge 
  public void addEdge(int u, int v) {
    adj.get(u).add(v);
    adj.get(v).add(u);  // Undirected
  }


  // DFS helper
  private void dfsUtil(int node, boolean[] visited) {
    visited[node] = true;
    System.out.print(node + " ");

    for (int neighbor : adj.get(node)) {
      if (!visited[neighbor]) {
        dfsUtil(neighbor, visited);
      }
    }
  }

  // DFS traversal from start node 
  public void dfs(int start) {
    boolean[] visited = new boolean[vertices];
    System.out.print("DFS: ");
    dfsUtil(start, visited);
    System.out.println();
  }

  public static void main(String[] args) {
    GraphDFS g = new GraphDFS(6);
    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 3);
    g.addEdge(2, 4);
    g.addEdge(3, 5);

    g.dfs(0);   // Output: 0 1 3 5 2 4
  }
}

