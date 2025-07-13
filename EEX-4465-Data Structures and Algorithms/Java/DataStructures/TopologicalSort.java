import java.util.*;

public class TopologicalSort {
    private int vertices;
    private List<List<Integer>> adj;

    public TopologicalSort(int v) {
        vertices = v;
        adj = new ArrayList<>();
        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<>());
    }

    // Add edge (u → v)
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    // Topo sort helper
    private void dfs(int node, boolean[] visited, Stack<Integer> stack) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) dfs(neighbor, visited, stack);
        }
        stack.push(node);
    }

    // Perform Topological Sort
    public void topologicalSort() {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) dfs(i, visited, stack);
        }

        System.out.print("Topological Sort: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        TopologicalSort graph = new TopologicalSort(6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        graph.topologicalSort(); // One valid output: 5 4 2 3 1 0
    }
}
