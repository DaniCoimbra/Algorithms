import graph.Graph;
import graph.Topological;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addDirectedEdge(0, 1);
        graph.addDirectedEdge(0, 2);
        graph.addDirectedEdge(1, 2);
        graph.addDirectedEdge(1, 5);
        graph.addDirectedEdge(2, 3);
        graph.addDirectedEdge(6, 1);
        graph.addDirectedEdge(6, 5);
        graph.addDirectedEdge(5, 3);
        graph.addDirectedEdge(5, 4);


        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
        Topological.topologicalSort(graph, visited);
        //bfs.BFS(graph,0);
    }
}
