package graph;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Kruskal {
    public static void kruskal(WeightedGraph graph) {
        List<WeightedGraph.WeightedEdge> edges = new LinkedList<>();
        for (int vertex = 0; vertex < graph.numVertices; vertex++) {
            for (WeightedGraph.WeightedEdge edge : graph.adjacencyList[vertex]) {
                edges.add(edge);
            }
        }
        edges.sort((e1, e2) -> e1.weight - e2.weight);

        int step = 0;
        int nEdges = 0;
        int totalWeight = 0;

        Subset subsets[] = new Subset[graph.numVertices];
        for (int i = 0; i < graph.numVertices; i++) {
            subsets[i] = new Subset(i, 0);
        }
        while (nEdges < graph.numVertices - 1) {
            WeightedGraph.WeightedEdge next = edges.get(step);
            int x = find(subsets, next.source);
            int y = find(subsets, next.destination);
            if (x!=y) {
                System.out.println(next.source + " " + next.destination);
                union(subsets,x,y);
                nEdges+=1;
                totalWeight+=next.weight;
            }
            step+=1;
        }
        System.out.println("Spanning Tree Weight: " + totalWeight);


    }

    static class Subset {
        int parent, rank;

        public Subset(int parent, int rank) {
            this.parent = parent;
            this.rank = rank;
        }
    }

    private static void union(Subset[] subsets, int x,
                              int y)
    {
        int rootX = find(subsets, x);
        int rootY = find(subsets, y);

        if (subsets[rootY].rank < subsets[rootX].rank) {
            subsets[rootY].parent = rootX;
        }
        else if (subsets[rootX].rank
                < subsets[rootY].rank) {
            subsets[rootX].parent = rootY;
        }
        else {
            subsets[rootY].parent = rootX;
            subsets[rootX].rank++;
        }
    }

    private static int find(Subset[] subsets, int i)
    {
        if (subsets[i].parent == i)
            return subsets[i].parent;

        subsets[i].parent
                = find(subsets, subsets[i].parent);
        return subsets[i].parent;
    }
}
