package src.problem.class1;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/8958
 */
public class Problem8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();
        int loopCount = Integer.parseInt(readLineString);

        String[] oxArray = new String[loopCount];

        for (int i = 0; i < loopCount; i++) {
            oxArray[i] = reader.readLine();
        }

        printAnswer(writer, oxArray);
        writer.flush();
        reader.close();
        writer.close();
    }

    private static void printAnswer(BufferedWriter writer, String[] oxArray) throws IOException {
        int score;
        for (String oxItem : oxArray) {
            score = getScore(oxItem);
            writer.write(String.valueOf(score));
            writer.write("\n");
        }
    }

    private static int getScore(String oxItem) {
        int score = 0, sum = 0;

        for (int i = 0; i < oxItem.length(); i++) {
            if (oxItem.charAt(i) == 'O') {
                score++;
            } else {
                score = 0;
            }
            sum += score;
        }

        return sum;
    }
}
