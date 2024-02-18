package src.problem.class3;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/1012
 */
public class Problem1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(reader.readLine());
        for (int i = 0; i < testCase; i++) {
            int[] inputNumbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int widthM = inputNumbers[0];
            int heightN = inputNumbers[1];
            int cabbageCount = inputNumbers[2];

            int answer = getAnswer(widthM, heightN, cabbageCount, reader);
            writer.write(answer + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }

    private static int getAnswer(int widthM, int heightN, int cabbageCount, BufferedReader reader) throws IOException {
        boolean[][] visited = new boolean[widthM][heightN];
        int[][] cabbageSpace = new int[widthM][heightN];

        for (int i = 0; i < cabbageCount; i++) {
            int[] cabbageLocation = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            cabbageSpace[cabbageLocation[0]][cabbageLocation[1]] = 1;
        }

        int wormCount = 0;
        for (int i = 0; i < widthM; i++) {
            for (int j = 0; j < heightN; j++) {
                if (cabbageSpace[i][j] == 1 && !visited[i][j]) {
                    dfs(cabbageSpace, visited, i, j, widthM, heightN);
                    wormCount++;
                }
            }
        }

        return wormCount;
    }

    private static void dfs(int[][] cabbageSpace, boolean[][] visited, int x, int y, int widthM, int heightN) {
        if (x < 0 || y < 0 || x >= widthM || y >= heightN || cabbageSpace[x][y] == 0 || visited[x][y]) {
            return;
        }

        visited[x][y] = true;
        dfs(cabbageSpace, visited, x + 1, y, widthM, heightN); // right
        dfs(cabbageSpace, visited, x - 1, y, widthM, heightN); // left
        dfs(cabbageSpace, visited, x, y + 1, widthM, heightN); // up
        dfs(cabbageSpace, visited, x, y - 1, widthM, heightN); // down
    }

}
