package graph;

import java.util.LinkedList;

public class FordFulkerson {
    public static void FordFulkerson(int graph[][], int s, int t) {
        int u, v;
        int flow = 0;
        int V = graph.length;
        int residual[][] = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                residual[i][j] = graph[i][j];
            }
        }
        int p[] = new int[V];

        while(bfs(residual,s,t,p)){
            int path_flow = Integer.MAX_VALUE;
            for(v = t; v != s; v = p[v]){
                u = p[v];
                path_flow = Math.min(path_flow,residual[u][v]);
            }
            for(v = t; v != s; v = p[v]){
                u = p[v];
                residual[u][v] -= path_flow;
                residual[v][u] += path_flow;
            }
            flow += path_flow;
        }
        System.out.println(flow);
    }

    public static boolean bfs(int residual[][], int s, int t, int parent[]) {
        int V = residual.length;
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; ++i)
            visited[i] = false;


        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(s);
        visited[s] = true;
        parent[s] = -1;

        while (queue.size() != 0) {
            int u = queue.poll();

            for (int v = 0; v < V; v++) {
                if (!visited[v] && residual[u][v] > 0) {

                    if (v == t) {
                        parent[v] = u;
                        return true;
                    }
                    queue.add(v);
                    parent[v] = u;
                    visited[v] = true;
                }
            }
        }
        return false;
    }
}
