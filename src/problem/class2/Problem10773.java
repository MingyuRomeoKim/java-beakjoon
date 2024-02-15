package src.problem.class2;

import java.io.*;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/10773
 */
public class Problem10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int roofCount = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < roofCount; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (number == 0) {
                stack.pop();
            } else {
                stack.push(number);
            }
        }
        reader.close();

        int answer = getSum(stack);
        writer.write(String.valueOf(answer));
        writer.flush();
        writer.close();
    }

    private static int getSum(Stack<Integer> stack) {
        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}