package src.problem.class3;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/1003
 */
public class Problem1003 {
    static int[][] dp = new int[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        dp[0][0] = 1; // 0을 입력했을 때 0이 출력되는 횟수
        dp[0][1] = 0; // 0을 입력했을 때 1이 출력되는 횟수
        dp[1][0] = 0; // 1을 입력했을 때 0이 출력되는 횟수
        dp[1][1] = 1; // 1을 입력했을 때 1이 출력되는 횟수

        // 모든 피보나치 수에 대한 0과 1의 출력 횟수를 미리 계산
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        int testCase = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testCase; i++) {
            int number = Integer.parseInt(reader.readLine());
            writer.write(dp[number][0] + " " + dp[number][1] + "\n");
        }
        writer.flush();
        reader.close();
        writer.close();
    }
}
