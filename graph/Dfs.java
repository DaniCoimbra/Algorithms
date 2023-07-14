package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Dfs {
    public static void recursiveDFS(Graph graph, int vertex, Map<Integer,Boolean> visited) {
        visited.put(vertex, true);
        System.out.println(vertex + " ");
        for (Integer v : graph.adjacencyList[vertex]) {
            if (!visited.containsKey(v)) {
                recursiveDFS(graph, v, visited);
            }
        }
    }
    public static void stackDFS(Graph graph, int vertex, Map<Integer,Boolean> visited) {
        List<Integer> stack = new LinkedList<>();
        stack.add(vertex);
        while(!stack.isEmpty()) {
            int head = stack.remove(stack.size()-1);
            if(!visited.containsKey(head)) {
                visited.put(head, true);
                System.out.println(head + " ");
                for (Integer v : graph.adjacencyList[head]) {
                    if (!visited.containsKey(v)) {
                        stack.add(v);
                    }
                }
            }
        }
    }
}
