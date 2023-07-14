package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Bfs {

    public static void BFS(Graph graph, int vertex) {
        List<Integer> queue = new LinkedList<Integer>();
        Map<Integer,Boolean> visited = new HashMap<Integer, Boolean>();
        visited.put(vertex, true);
        queue.add(vertex);
        while(!queue.isEmpty()) {
            int head = queue.get(0);
            queue.remove(0);
            System.out.println(head + " ");
            visited.put(head,true);
            for (Integer v : graph.adjacencyList[head]) {
                if (!visited.containsKey(v)) {
                    visited.put(v,true);
                    queue.add(v);
                }
            }
        }
    }
}
