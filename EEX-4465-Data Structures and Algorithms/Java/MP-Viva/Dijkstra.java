import java.util.*;

class Dijkstra {
    public Map<String, Integer> shortestPath(Graph graph, String start) {
        Map<String, Integer> distance = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());

        for (String node : graph.getAdjList().keySet()) {
            distance.put(node, Integer.MAX_VALUE);
        }
        distance.put(start, 0);
        pq.offer(new AbstractMap.SimpleEntry<>(start, 0));

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> current = pq.poll();
            String u = current.getKey();

            for (Graph.Edge edge : graph.getAdjList().get(u)) {
                int newDist = distance.get(u) + edge.distance;
                if (newDist < distance.get(edge.destination)) {
                    distance.put(edge.destination, newDist);
                    pq.offer(new AbstractMap.SimpleEntry<>(edge.destination, newDist));
                }
            }
        }

        return distance;
    }
}
