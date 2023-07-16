package graph;

import java.util.HashMap;
import java.util.Map;

public class BellmanFord {
    public static void bellmanFord(WeightedGraph graph, int start) {
        Map<Integer, Integer> distance = new HashMap<>();
        for (int i = 0; i < graph.numVertices; i++) {
            distance.put(i, Integer.MAX_VALUE);
        }
        distance.replace(start, 0);
        boolean updated;

        for (int j = 0; j < graph.numVertices - 1; j++) {
            updated = false;

            for (int vertex = 0; vertex < graph.numVertices; vertex++) {
                for (WeightedGraph.WeightedEdge edge : graph.adjacencyList[vertex]) {
                    int destination = edge.destination;
                    int weight = edge.weight;
                    int update = distance.get(vertex) + weight;
                    if (update < distance.get(destination)) {
                        distance.replace(destination, update);
                        updated = false;
                    }
                }
            }
            if (!updated) {
                break;
            }
        }
        for (int vertex = 0; vertex < graph.numVertices; vertex++) {
            for (WeightedGraph.WeightedEdge edge : graph.adjacencyList[vertex]) {
                int destination = edge.destination;
                int weight = edge.weight;

                if (distance.get(vertex) != Integer.MAX_VALUE && distance.get(vertex) + weight < distance.get(destination)) {
                    throw new RuntimeException("Graph contains negative weight cycle");
                }
            }
        }
        for (int i = 0; i < distance.size(); i++) {
            System.out.print(i + " ");
            System.out.println(distance.get(i));
        }

    }
}
