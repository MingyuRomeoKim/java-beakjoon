package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/1676
 */
public class Problem1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNumber = Integer.parseInt(reader.readLine());

        int answer = 0;
        for (int i = 5; i <= inputNumber; i *= 5) {
            answer += inputNumber / i;
        }

        writer.write(String.valueOf(answer));
        writer.flush();
        reader.close();
        writer.close();
    }
}