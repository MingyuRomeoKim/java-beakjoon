package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/1654
 */

public class Problem1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] readLineArray = reader.readLine().split(" ");
        int k = Integer.parseInt(readLineArray[0]);
        int n = Integer.parseInt(readLineArray[1]);

        long[] lanArray = new long[k];
        long max = 0;
        for (int i = 0; i < k; i++) {
            lanArray[i] = Long.parseLong(reader.readLine());
            max = Math.max(max, lanArray[i]);
        }

        long answer = getMaxLanLength(k, n, lanArray, max);

        System.out.println(answer);
    }

    private static long getMaxLanLength(int k, int n, long[] lanArray, long max) {
        long left = 1;
        long right = max;
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            long count = 0;

            for (long lan : lanArray) {
                count += (lan / mid);
            }

            if (count >= n) {
                left = mid + 1;
                answer = Math.max(answer, mid);
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}