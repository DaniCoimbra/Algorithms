import graph.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(4);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 3, 5);
        graph.addEdge(0, 2, 6);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);


        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        Kruskal.kruskal(graph);
        Prim.prim(graph);

        //bfs.BFS(graph,0);
    }
}
