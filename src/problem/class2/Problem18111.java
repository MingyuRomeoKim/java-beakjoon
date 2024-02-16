package src.problem.class2;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/18111
 */
public class Problem18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] firstLine = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = firstLine[0];
        int m = firstLine[1];
        int b = firstLine[2];

        int[][] area = new int[n][m];
        for (int i = 0; i < n; i++) {
            int[] inputLine = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < inputLine.length; j++) {
                area[i][j] = inputLine[j];
            }
        }
        reader.close();

        String answer = getAnswer(area,b);
        writer.write(answer);
        writer.flush();
        writer.close();
    }

    private static String getAnswer(int[][] area, int b) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int[] row : area) {
            for (int height : row) {
                min = Math.min(min, height);
                max = Math.max(max, height);
            }
        }

        int resultTime = Integer.MAX_VALUE;
        int resultHeight = -1;

        for (int targetHeight = min; targetHeight <= max; targetHeight++) {
            int time = 0;
            int inventory = b;

            for (int[] row : area) {
                for (int height : row) {
                    if (height > targetHeight) {
                        time += (height - targetHeight) * 2; // 블록 제거
                        inventory += (height - targetHeight);
                    } else if (height < targetHeight) {
                        time += (targetHeight - height); // 블록 추가
                        inventory -= (targetHeight - height);
                    }
                }
            }

            if (inventory >= 0 && time <= resultTime) {
                resultTime = time;
                if (time == resultTime) {
                    resultHeight = Math.max(resultHeight, targetHeight);
                } else {
                    resultHeight = targetHeight;
                }
            }
        }

        return resultTime + " " + resultHeight;
    }
}
