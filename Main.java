import graph.Dijkstra;
import graph.Graph;
import graph.Topological;
import graph.WeightedGraph;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(7);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 2, 6);
        graph.addEdge(1, 3, 5);
        graph.addEdge(2, 3, 8);
        graph.addEdge(3, 4, 10);
        graph.addEdge(3, 5, 15);
        graph.addEdge(4, 6, 2);
        graph.addEdge(5, 6, 6);


        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        Dijkstra.dijkstra(graph,0, visited);
        //bfs.BFS(graph,0);
    }
}
