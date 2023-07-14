import graph.Graph;
import graph.Topological;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addDirectedEdge(5, 2);
        graph.addDirectedEdge(5, 0);
        graph.addDirectedEdge(4, 0);
        graph.addDirectedEdge(4, 1);
        graph.addDirectedEdge(2, 3);
        graph.addDirectedEdge(3, 1);
        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        Topological.topologicalSort(graph, visited);
        //bfs.BFS(graph,0);
    }
}
