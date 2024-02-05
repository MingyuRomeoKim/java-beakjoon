package src.problem.class2;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/1546
 */
public class Problem1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalCount = Integer.parseInt(reader.readLine());
        int[] jumsooArray = new int[totalCount];
        String[] stringArray = reader.readLine().split(" ");

        for (int i = 0; i < totalCount; i++) {
            jumsooArray[i] = Integer.parseInt(stringArray[i]);
        }

        int maxJumsoo = Arrays.stream(jumsooArray).max().getAsInt();

        double newJumsooArray[] = new double[totalCount];
        for (int i = 0; i < totalCount; i++) {
            newJumsooArray[i] = getNewJumsoo(jumsooArray[i], maxJumsoo);
        }

        float newJumsoo = 0;
        for (double value: newJumsooArray) {
            newJumsoo += value;
        }
        writer.write(String.valueOf(newJumsoo / totalCount));
        writer.flush();
        writer.close();
        reader.close();
    }

    private static double getNewJumsoo(int jumsoo, int maxJumsoo) {
        return ((double) jumsoo /(double) maxJumsoo) * 100;
    }
}
