package src.problem.class2;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://www.acmicpc.net/problem/2164
 */
public class Problem2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNumber = Integer.parseInt(reader.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= inputNumber ; i++) {
            deque.addLast(i);
        }

        while (deque.size() > 1) {
            deque.removeFirst();
            deque.addLast(deque.removeFirst());
        }

        writer.write(String.valueOf(deque.getFirst()));
        writer.flush();
        reader.close();
        writer.close();
    }
}
