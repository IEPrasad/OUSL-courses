import java.util.*;

public class GraphAdjList {
  private int vertices;
  private List<List<Integer>> adjList;

  // Constructor
  public GraphAdjList(int v) {
    vertices = v;
    adjList = new ArrayList<>();
    for (int i = 0; i < v; i++) {
      adjList.add(new ArrayList<>());
    }
  }

  // Add edge
  public void addEdge(int u, int v) {
    adjList.get(u).add(v);
    adjList.get(v).add(u);  // For undirected graph
  }

  // Print graph
  public void printGraph() {
    for (int i = 0; i < vertices; i++) {
      System.out.print(i + " → ");
      for (int j : adjList.get(i)) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  // Main 
  public static void main(String[] args) {
    GraphAdjList graph = new GraphAdjList(5);

    graph.addEdge(0, 1);
    graph.addEdge(0, 4);
    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(1, 4);
    graph.addEdge(2, 3);
    graph.addEdge(3, 4);

    graph.printGraph();
  }
}
