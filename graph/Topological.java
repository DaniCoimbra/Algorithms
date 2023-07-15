package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Topological {
    public static void topologicalSort(Graph graph, Map<Integer, Boolean> visited) {
        List<Integer> stack = new LinkedList<>();

        for (int i = 0; i < graph.numVertices; i++) {
            if (!visited.containsKey(i)) {
                topologicalSortUtil(graph, i, visited, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.remove(stack.size()-1));
        }
    }

    private static void topologicalSortUtil(Graph graph, int vertex, Map<Integer, Boolean> visited, List<Integer> stack) {
        visited.put(vertex, true);

        for (Integer adjVertex : graph.adjacencyList[vertex]) {
            if (!visited.containsKey(adjVertex)) {
                topologicalSortUtil(graph, adjVertex, visited, stack);
            }
        }

        stack.add(vertex);
    }
}
