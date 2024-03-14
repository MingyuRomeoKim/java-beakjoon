package src.problem.class3;

import java.io.*;

public class Problem2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int stairs = Integer.parseInt(reader.readLine());
        int[] stairsPoints = new int[stairs + 1];
        int[] dp = new int[stairs + 1];

        for (int i = 1; i <= stairs; i++) {
            stairsPoints[i] = Integer.parseInt(reader.readLine());
        }

        // 초기값 설정
        dp[1] = stairsPoints[1];
        if (stairs >= 2) {
            dp[2] = stairsPoints[1] + stairsPoints[2];
        }

        // DP를 이용한 최대 점수 계산
        for (int i = 3; i <= stairs; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairsPoints[i - 1]) + stairsPoints[i];
        }

        writer.write(String.valueOf(dp[stairs]));
        writer.flush();
        reader.close();
        writer.close();
    }
}

