package graph;

import java.util.LinkedList;

public class Graph {
    public int numVertices;
    public LinkedList<Integer>[] adjacencyList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];

        for (int i = 0; i < numVertices; ++i)
            adjacencyList[i] = new LinkedList<>();
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source);
    }


}
