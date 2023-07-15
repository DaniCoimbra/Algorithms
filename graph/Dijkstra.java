package graph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Dijkstra {
    static class Node implements Comparable<Node> {
        int v;
        int distance;

        public Node(int v, int distance) {
            this.v = v;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node n) {
            if (this.distance <= n.distance) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public static void dijkstra(WeightedGraph graph, int start, Map<Integer, Boolean> visited) {
        Map<Integer, Integer> distance = new HashMap<>();
        for (int i = 0; i < graph.numVertices; i++) {
            distance.put(i, Integer.MAX_VALUE);
        }
        PriorityQueue<Node> queue = new PriorityQueue<>();

        distance.replace(start, 0);
        queue.add(new Node(start, 0));

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int vertex = node.v;
            int dist = node.distance;
            if (visited.containsKey(vertex)) {
                continue;
            }
            visited.put(vertex, true);
            for (WeightedGraph.WeightedEdge v : graph.adjacencyList[vertex]) {
                int update = distance.get(vertex) + v.weight;
                if (update < distance.get(v.destination)) {
                    distance.replace(v.destination,update);
                    queue.add(new Node(v.destination,update));
                }
            }
        }
        for (int i = 0; i < distance.size(); i++) {
            System.out.print(i + " ");
            System.out.println(distance.get(i));
        }

    }
}
