package src.problem.class2;

import java.io.*;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Queue;

/**
 * https://www.acmicpc.net/problem/11866
 */
public class Problem11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] inputArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        reader.close();

        int n = inputArray[0];
        int k = inputArray[1];

        String answer = getAnswer(n,k);

        writer.write(answer);
        writer.flush();
        writer.close();
    }

    private static String getAnswer(int n,int k) {
        String answer = "";
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<");

        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }

            stringBuilder.append(queue.poll());

            if (!queue.isEmpty()) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append(">");

        return stringBuilder.toString();
    }
}
