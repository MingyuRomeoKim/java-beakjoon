package src.problem.class3;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/11047
 */
public class Problem11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] inputArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = inputArray[0];
        int k = inputArray[1];
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(reader.readLine());
        }

        int answer = getAnswer(coins,n,k);

        writer.write(String.valueOf(answer));
        writer.flush();
        writer.close();
        reader.close();
    }

    private static int getAnswer(int[] coins, int n, int k)
    {
        int count = 0;

        // 동전의 가치가 큰 것부터 확인
        for (int i = n - 1; i >= 0; i--) {
            // 현재 동전으로 만들 수 있는 최대 금액을 더하고, 카운트를 센다
            if (k / coins[i] > 0) {
                count += k / coins[i];
                k %= coins[i];
            }
        }

        return count;
    }
}
