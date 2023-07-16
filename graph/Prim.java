package graph;

import java.util.*;

public class Prim {
    public static void prim(WeightedGraph graph) {
        List<WeightedGraph.WeightedEdge> mstEdges = new LinkedList<>();
        Set<Integer> mstVertices = new HashSet<>();
        PriorityQueue<WeightedGraph.WeightedEdge> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        mstVertices.add(0);


        for (WeightedGraph.WeightedEdge edge : graph.adjacencyList[0]) {
            minHeap.offer(edge);
        }

        while (mstVertices.size() < graph.numVertices) {
            WeightedGraph.WeightedEdge minEdge = minHeap.poll();
            int vertex = minEdge.destination;

            if (mstVertices.contains(vertex)) {
                // Skip this edge if the destination vertex is already in MST
                continue;
            }

            mstVertices.add(vertex);
            mstEdges.add(minEdge);

            for (WeightedGraph.WeightedEdge edge : graph.adjacencyList[vertex]) {
                if (!mstVertices.contains(edge.destination)) {
                    minHeap.offer(edge);
                }
            }
        }

        for (WeightedGraph.WeightedEdge e : mstEdges) {
            System.out.println(e.source + " " + e.destination);
        }
    }
}
