package graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class topological {
    public static void topologicalSort(Graph graph, Map<Integer,Boolean> visited) {
        List<Integer> stack = new LinkedList<>();
        List<Integer> recursive = new LinkedList<>();
        List<Integer> reverse = new LinkedList<>();

        for (int i = 0; i < graph.adjacencyList.length; i++) {
            if(!visited.containsKey(i)) {
                recursive.add(i);
                while(!recursive.isEmpty()) {
                    int tail = recursive.remove(recursive.size()-1);
                    reverse.add(tail);
                    if(!visited.containsKey(tail)) {
                        visited.put(tail, true);
                        for (Integer v : graph.adjacencyList[tail]) {
                            if (!visited.containsKey(v)) {
                                recursive.add(v);
                            }
                        }
                    }
                }
                for (int j = reverse.size()-1; j >=0; j--) {
                    stack.add(reverse.remove(j));
                }
            }
        }
        for (int j = stack.size()-1; j >=0; j--) {
            System.out.println(stack.remove(j));
        }
    }
}
