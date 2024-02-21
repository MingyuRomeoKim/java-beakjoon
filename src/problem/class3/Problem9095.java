package src.problem.class3;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/9095
 */
public class Problem9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testCase; i++) {
            int number = Integer.parseInt(reader.readLine());
            int answer = getAnswer(number);
            writer.write(answer + "\n");
        }
        reader.close();
        writer.flush();
        writer.close();
    }

    private static int getAnswer(int number) {
        if (number < 4) {
            if (number == 1) return 1;
            else if (number == 2) return 2;
            else return 4;
        }

        int[] dp = new int[number + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= number; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[number];
    }
}
