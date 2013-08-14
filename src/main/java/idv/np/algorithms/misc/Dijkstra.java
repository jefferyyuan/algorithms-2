package idv.np.algorithms.misc;

import java.util.Arrays;

/**
 * User: Nightpig
 * Date: 2013/8/14
 * Time: 下午 3:48
 */
public class Dijkstra {

    public static String execute(int[][] graph, int src, int dest) {
        boolean[] visited = new boolean[graph.length];
        int[] distinace = new int[graph.length];
        int[] parent = new int[graph.length];
        Arrays.fill(distinace, Integer.MAX_VALUE);
        distinace[src] = 0;
        for (int i = 0; i < distinace.length; i++) {
            int min = Integer.MAX_VALUE, minIx = -1;
            for (int j = 0; j < distinace.length; j++) {
                if (!visited[j] && distinace[j] < min) {
                    min = distinace[j];
                    minIx = j;
                }
            }
            if (minIx == -1) {
                break;
            }
            visited[minIx] = true;
            for (int j = 0; j < graph[minIx].length; j++) {
                if (graph[minIx][j] != -1) {
                    int tmp = distinace[minIx] + graph[minIx][j];
                    if (!visited[j] && tmp < distinace[j]) {
                        distinace[j] = tmp;
                        parent[j] = minIx;
                    }
                }
            }
        }
        StringBuilder path = new StringBuilder();
        findPath(path, parent, dest);
        return path.toString().trim();
    }

    private static void findPath(StringBuilder path, int[] parent, int x) {
        if (x != parent[x]) {
            findPath(path, parent, parent[x]);
        }
        path.append(" ").append(x);
    }

}
