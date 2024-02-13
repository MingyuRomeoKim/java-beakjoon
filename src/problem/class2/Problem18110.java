package src.problem.class2;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/18110
 */
public class Problem18110 {
    public static void main(String[] args) throws IOException {
        final float TopAndBottomExceptPercent = 0.15F;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int roofCount = Integer.parseInt(reader.readLine());

        int[] numberArray = new int[roofCount];
        for (int i = 0; i < roofCount; i++) {
            numberArray[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        Arrays.sort(numberArray);

        int exceptNumber = Math.round(roofCount * TopAndBottomExceptPercent);
        int totalSum = 0;
        int totalSumCount = 0;
        for (int i = exceptNumber; i < roofCount - exceptNumber; i++) {
            totalSum += numberArray[i];
            totalSumCount++;
        }

        writer.write(String.valueOf(Math.round((double) totalSum / totalSumCount)));
        writer.flush();
        writer.close();
    }
}
