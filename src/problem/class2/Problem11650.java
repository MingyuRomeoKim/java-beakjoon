package src.problem.class2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.acmicpc.net/problem/11650
 */
public class Problem11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int nPointCount = Integer.parseInt(reader.readLine());
        int[][] points = new int[nPointCount][2];

        for (int i = 0; i < nPointCount; i++) {
            int[] inputPoints = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            points[i][0] = inputPoints[0];
            points[i][1] = inputPoints[1];
        }

        Arrays.sort(points, Comparator.comparingInt((int[] point) -> point[0])
                .thenComparingInt(point -> point[1]));

        for (int[] point : points) {
            writer.write(point[0] + " " + point[1] + "\n");
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
