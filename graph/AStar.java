package graph;

import java.util.*;

public class AStar {
    static class Node implements Comparable<Node> {
        int[] v;
        int distance;

        public Node(int[] v, int distance) {
            this.v = v;
            this.distance = distance;
        }

        @Override
        public int compareTo(Node n) {
            if (this.distance <= n.distance) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public static void Dijkstra(int[][] adjacencyMatrix, int[] start, int[] target, Map<Integer, Boolean> visited) {
        PriorityQueue<Node> queue = new PriorityQueue();
        queue.add(new Node(start, 0));

        Map<Integer, Integer> prev = new HashMap<>();
        Map<Integer ,Integer> cost = new HashMap<>();
        for(int i = 0; i < adjacencyMatrix.length; i++) {
            for(int j = 0; j < adjacencyMatrix[0].length; j++) {
                cost.put(linearIndex(new int[]{i, j}, adjacencyMatrix),Integer.MAX_VALUE);
            }
        }

        prev.put(linearIndex(start,adjacencyMatrix),-1);
        cost.put(linearIndex(start,adjacencyMatrix),0);

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            int[] vertex = node.v;

            if (visited.containsKey(linearIndex(vertex,adjacencyMatrix))) {
                continue;
            }
            visited.put(linearIndex(vertex,adjacencyMatrix), true);

            if (linearIndex(vertex,adjacencyMatrix).equals(linearIndex(target,adjacencyMatrix))) {
                break;
            }

            for (int[] dest : adjacent(vertex)) {
                if (dest[0] < 0 || dest[1] < 0 || dest[0] >= adjacencyMatrix.length || dest[1] >= adjacencyMatrix[0].length || adjacencyMatrix[dest[0]][dest[1]] == 0){
                    continue;
                }
                int update = cost.get(linearIndex(vertex,adjacencyMatrix)) + 1;
                if (update < cost.get(linearIndex(dest,adjacencyMatrix))) {
                    cost.replace(linearIndex(dest,adjacencyMatrix),update);
                    queue.add(new Node(dest,update));
                    prev.put(linearIndex(dest,adjacencyMatrix),linearIndex(vertex,adjacencyMatrix));
                }
            }
        }
        for (int v : prev.keySet()) {
            System.out.print(Arrays.toString(indexToCoordinates(v,adjacencyMatrix)) + " ");
            System.out.println(Arrays.toString(indexToCoordinates(prev.get(v),adjacencyMatrix)));
        }
        System.out.println(prev.size());
    }

    public static void AStar(int[][] adjacencyMatrix, int[] start, int[] target, Map<Integer, Boolean> visited) {
        PriorityQueue<Node> queue = new PriorityQueue();
        queue.add(new Node(start, 0));

        Map<Integer, Integer> prev = new HashMap<>();
        Map<Integer ,Integer> cost = new HashMap<>();
        for(int i = 0; i < adjacencyMatrix.length; i++) {
            for(int j = 0; j < adjacencyMatrix[0].length; j++) {
                cost.put(linearIndex(new int[]{i, j}, adjacencyMatrix),Integer.MAX_VALUE);
            }
        }

        prev.put(linearIndex(start,adjacencyMatrix),-1);
        cost.put(linearIndex(start,adjacencyMatrix),0);

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            int[] vertex = node.v;

            if (visited.containsKey(linearIndex(vertex,adjacencyMatrix))) {
                continue;
            }
            visited.put(linearIndex(vertex,adjacencyMatrix), true);

            if (linearIndex(vertex,adjacencyMatrix).equals(linearIndex(target,adjacencyMatrix))) {
                break;
            }

            for (int[] dest : adjacent(vertex)) {
                if (dest[0] < 0 || dest[1] < 0 || dest[0] >= adjacencyMatrix.length || dest[1] >= adjacencyMatrix[0].length || adjacencyMatrix[dest[0]][dest[1]] == 0){
                    continue;
                }
                int update = cost.get(linearIndex(vertex,adjacencyMatrix)) + 1;
                if (update < cost.get(linearIndex(dest,adjacencyMatrix))) {
                    cost.replace(linearIndex(dest,adjacencyMatrix),update);
                    int heuristicCost = update + heuristic(dest, target);
                    queue.add(new Node(dest,heuristicCost));
                    prev.put(linearIndex(dest,adjacencyMatrix),linearIndex(vertex,adjacencyMatrix));
                }
            }
        }
        for (int v : prev.keySet()) {
            System.out.print(Arrays.toString(indexToCoordinates(v,adjacencyMatrix)) + " ");
            System.out.println(Arrays.toString(indexToCoordinates(prev.get(v),adjacencyMatrix)));
        }
        System.out.println(prev.size());
    }

    private static int heuristic(int[] dest, int[] target) {
        double x = Math.pow(dest[0] - target[0],2);
        double y = Math.pow(dest[1] - target[1],2);
        return (int)(Math.sqrt(x + y)*1000);
    }

    private static Integer linearIndex(int[] ints, int[][] adjacencyMatrix) {
        int numRows = adjacencyMatrix.length;
        int numColumns = adjacencyMatrix[0].length;

        int x = ints[0];
        int y = ints[1];

        int linearIndex = y * numColumns + x;
        return linearIndex;
    }

    private static int[] indexToCoordinates(int linearIndex, int[][] adjacencyMatrix) {
        int numRows = adjacencyMatrix.length;
        int numColumns = adjacencyMatrix[0].length;

        int y = linearIndex / numColumns;
        int x = linearIndex % numColumns;

        int[] coordinates = {x, y};
        return coordinates;
    }



    private static ArrayList<int[]> adjacent(int[] vertex) {
        ArrayList<int[]> adj = new ArrayList<>();
        int[] v = vertex;
        int[] up = {v[0],v[1]+1};
        int[] down = {v[0],v[1]-1};
        int[] left = {v[0]-1,v[1]};
        int[] right = {v[0]+1,v[1]};
        adj.add(up);
        adj.add(down);
        adj.add(left);
        adj.add(right);
        return adj;
    }
}
