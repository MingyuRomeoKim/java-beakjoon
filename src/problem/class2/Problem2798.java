package src.problem.class2;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/2798
 */
public class Problem2798 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] inputs = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] cards = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int totalCardCount = inputs[0];
        int maxCardValue = inputs[1];

        int answer = getAnswer(totalCardCount, maxCardValue, cards);

        writer.write(String.valueOf(answer));
        writer.flush();
        reader.close();
        writer.close();
    }

    private static int getAnswer(int totalCardCount, int maxCardValue, int[] cards) {
        int answer = 0;

        for (int i = 0; i < totalCardCount - 2; i++) {
            for (int j = i + 1; j < totalCardCount - 1; j++) {
                for (int k = j + 1; k < totalCardCount; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= maxCardValue && sum > answer) {
                        answer = sum;
                    }
                }
            }
        }

        return answer;
    }
}
