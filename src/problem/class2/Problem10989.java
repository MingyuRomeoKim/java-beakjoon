package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/10989
 */
public class Problem10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberLength = Integer.parseInt(reader.readLine());

        int[] count = new int[10001];

        for (int i = 0; i < numberLength; i++) {
            int inputNumber = Integer.parseInt(reader.readLine());
            count[inputNumber]++;
        }

        for (int i = 1; i <= 10000; i++) {
            for (int j = 0; j < count[i]; j++) {
                writer.write(i + "\n");
            }
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
