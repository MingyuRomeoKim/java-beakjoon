package src.problem.class3;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/1260
 */
public class Problem1260 {
    static int[][] graph;
    static boolean[] visited;
    static int n, m, v;
    static StringBuilder dfsResult = new StringBuilder();
    static StringBuilder bfsResult = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] nmv = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        n = nmv[0];
        m = nmv[1];
        v = nmv[2];

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int[] connection = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            graph[connection[0]][connection[1]] = 1;
            graph[connection[1]][connection[0]] = 1; // 양방향 그래프
        }
        reader.close();

        dfs(v);
        Arrays.fill(visited, false);
        bfs(v);

        writer.write(dfsResult.toString().trim() + "\n");
        writer.write(bfsResult.toString().trim());
        writer.flush();
        writer.close();
    }

    private static void dfs(int start) {
        visited[start] = true;
        dfsResult.append(start).append(" ");
        for (int i = 1; i <= n; i++) {
            if (graph[start][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfsResult.append(node).append(" ");
            for (int i = 1; i <= n; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
