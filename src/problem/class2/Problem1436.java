package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/1436
 */
public class Problem1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int turn = Integer.parseInt(reader.readLine());

        int movie666Number = getMovie666Number(turn);

        writer.write(String.valueOf(movie666Number));
        writer.flush();
        reader.close();
        writer.close();
    }

    private static int getMovie666Number(int turn) {
        int iTurn = 1;
        final String SixSixSix = "666";
        for (int i = 666; i < Integer.MAX_VALUE; i++) {
            if (!String.valueOf(i).contains(SixSixSix)) continue;

            if (turn == iTurn) {
                return i;
            }
            iTurn++;
        }
        return 0;
    }
}
