import graph.Graph;
import graph.bfs;
import graph.dfs;
import sorting.*;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();

        bfs.BFS(graph,0);
    }
}
