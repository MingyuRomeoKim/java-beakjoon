package src.problem.class2;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/11651
 */
public class Problem11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int roofCount = Integer.parseInt(reader.readLine());
        String[] inputXAndYs = new String[roofCount];
        for (int i = 0; i < roofCount; i++) {
            inputXAndYs[i] = reader.readLine();
        }
        reader.close();

        int[][] answer = getAnswer(inputXAndYs);
        for (int i = 0; i < answer.length; i++) {
            writer.write(answer[i][0] + " " + answer[i][1] + "\n");
        }
        writer.flush();
        writer.close();
    }

    private static int[][] getAnswer(String[] inputXAndYs) {
        int[][] xAndYs = new int[inputXAndYs.length][2];

        for (int i = 0; i < inputXAndYs.length; i++) {
            int[] xAndY = Arrays.stream(inputXAndYs[i].split(" ")).mapToInt(Integer::parseInt).toArray();
            xAndYs[i][0] = xAndY[0];
            xAndYs[i][1] = xAndY[1];
        }

        Arrays.sort(xAndYs, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        return xAndYs;
    }
}
