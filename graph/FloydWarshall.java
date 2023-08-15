package graph;

public class FloydWarshall {
    public static void floydWarshall(int[][] adjacencyMatrix) {
        int[][] distance = new int[adjacencyMatrix.length][adjacencyMatrix[0].length];
        int[][] next = new int[adjacencyMatrix.length][adjacencyMatrix[0].length];

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[0].length; j++) {
                distance[i][j] = adjacencyMatrix[i][j];
                if (adjacencyMatrix[i][j] != 0) {
                    next[i][j] = j;
                } else {
                    next[i][j] = -1;
                }
            }
        }

        for (int k = 0; k < adjacencyMatrix.length; k++) {
            for (int i = 0; i < adjacencyMatrix.length; i++) {
                for (int j = 0; j < adjacencyMatrix.length; j++) {
                    if (distance[i][k] == Integer.MAX_VALUE || distance[k][j] == Integer.MAX_VALUE) {
                        continue;
                    }
                    if (distance[i][k] + distance[k][j] < distance[i][j]) {
                        distance[i][j] = distance[i][k] + distance[k][j];
                        next[i][j] = next[i][k];
                    }
                }
            }
        }

        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix.length; j++) {
                System.out.print(distance[i][j] + " ");
            }
            System.out.println();
        }
    }
}
