import java.util.*;

class Graph {
    private Map<String, List<Edge>> adjList = new HashMap<>();

    static class Edge {
        String destination;
        int distance;

        Edge(String destination, int distance) {
            this.destination = destination;
            this.distance = distance;
        }
    }

    public void addLocation(String location) {
        adjList.putIfAbsent(location, new ArrayList<>());
    }

    public void addRoad(String from, String to, int distance) {
        adjList.get(from).add(new Edge(to, distance));
        adjList.get(to).add(new Edge(from, distance)); // for undirected road
    }

    public Map<String, List<Edge>> getAdjList() {
        return adjList;
    }
}
