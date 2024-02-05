package src.problem.class1;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2562
 */
public class Problem2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int readLineInt, maxInt = 0, maxIntIndex = 0;
        for (int i = 1; i <= 9; i++) {
            readLineInt = Integer.parseInt(reader.readLine());

            if (maxInt < readLineInt) {
                maxInt = readLineInt;
                maxIntIndex = i;
            }
        }

        writer.write(String.valueOf(maxInt));
        writer.write("\n");
        writer.write(String.valueOf(maxIntIndex));
        writer.flush();

        reader.close();
        writer.close();
    }
}
