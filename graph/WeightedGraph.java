package graph;

import java.util.LinkedList;

public class WeightedGraph {
    public int numVertices;
    public LinkedList<WeightedEdge>[] adjacencyList;

    public WeightedGraph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; ++i)
            adjacencyList[i] = new LinkedList<>();
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyList[source].add(new WeightedEdge(source, destination, weight));
        adjacencyList[destination].add(new WeightedEdge(destination,source, weight));
    }
    public void addDirectedEdge(int source, int destination, int weight) {
        adjacencyList[source].add(new WeightedEdge(source, destination, weight));
    }

    // WeightedEdge class to store the destination vertex and weight of the edge
    public static class WeightedEdge {
        public int source;
        public int destination;
        public int weight;

        public WeightedEdge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
}
