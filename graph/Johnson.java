package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Johnson {
    public static void Johnson(WeightedGraph graph) {
        int newVertex = 0;
        WeightedGraph newGraph = new WeightedGraph(graph.adjacencyList.length+1);
        for (int i = 0; i < graph.numVertices; i++) {
            newGraph.addDirectedEdge(0, i+1, 0);
        }
        for (int i = 0; i < graph.numVertices; i++) {
            for (WeightedGraph.WeightedEdge edge : graph.adjacencyList[i]) {
                newGraph.addDirectedEdge(edge.source+1, edge.destination+1, edge.weight);
            }
        }
        Map<Integer, Integer> distances = BellmanFord(newGraph, newVertex);
        for (int i = 0; i < graph.numVertices; i++) {
            for (WeightedGraph.WeightedEdge edge : graph.adjacencyList[i]) {
                edge.weight = edge.weight + distances.get(edge.source) - distances.get(edge.destination);
            }
        }
        for (int i = 0; i < graph.numVertices; i++) {
            Dijkstra.dijkstra(graph, i, new HashMap<>());
        }
    }

    public static Map<Integer, Integer> BellmanFord(WeightedGraph graph, int source) {
        Map<Integer, Integer> distance = new HashMap<>();
        for (int i = 0; i < graph.numVertices; i++) {
            distance.put(i, Integer.MAX_VALUE);
        }
        distance.replace(source, 0);
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
        return distance;
    }
}
