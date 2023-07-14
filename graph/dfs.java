package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class dfs {
    public static void DFS(Graph graph, int vertex, Map<Integer,Boolean> visited) {
        visited.put(vertex, true);
        System.out.println(vertex + " ");
        for (Integer v : graph.adjacencyList[vertex]) {
            if (!visited.containsKey(v)) {
                DFS(graph, v, visited);
            }
        }
    }
}
