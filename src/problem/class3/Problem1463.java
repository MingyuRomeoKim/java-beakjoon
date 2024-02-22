package src.problem.class3;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/1463
 */
public class Problem1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(reader.readLine());
        reader.close();

        int answer = getAnswer(number);

        writer.write(String.valueOf(answer));
        writer.flush();
        writer.close();
    }
    private static int getAnswer(int number) {
        if (number == 1) return 0;

        int[] dp = new int[number + 1];
        dp[1] = 0;
        if (number > 1) dp[2] = 1;
        if (number > 2) dp[3] = 1;

        for (int i = 4; i <= number; i++) {
            dp[i] = dp[i - 1] + 1;
            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i / 3] + 1);
        }

        return dp[number];
    }
}
