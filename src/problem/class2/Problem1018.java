package src.problem.class2;

import java.io.*;
import java.util.ArrayList;

/**
 * https://www.acmicpc.net/problem/1018
 */
public class Problem1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] readLineArray = reader.readLine().split(" ");
        int n = Integer.parseInt(readLineArray[0]);
        int m = Integer.parseInt(readLineArray[1]);

        ArrayList<String> inputStrings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputStrings.add(reader.readLine());
        }

        int answer = getAnswerNumber(n, m, inputStrings);
        writer.write(String.valueOf(answer));
        writer.newLine();
        writer.flush();
        reader.close();
        writer.close();
    }

    private static int getAnswerNumber(int n, int m, ArrayList<String> inputStrings) {
        int minCount = Integer.MAX_VALUE;

        for (int i = 0; i + 7 < n; i++) {
            for (int j = 0; j + 7 < m; j++) {
                minCount = Math.min(minCount, getCountUsingByFixed(i, j, inputStrings));
            }
        }

        return minCount;
    }

    private static int getCountUsingByFixed(int x, int y, ArrayList<String> inputStrings) {
        int endX = x + 8;
        int endY = y + 8;
        int count1 = 0; // 맨 왼쪽 위 칸이 W인 경우
        int count2 = 0; // 맨 왼쪽 위 칸이 B인 경우

        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {
                if ((i + j) % 2 == 0) {
                    if (inputStrings.get(i).charAt(j) != 'W') count1++;
                    if (inputStrings.get(i).charAt(j) != 'B') count2++;
                } else {
                    if (inputStrings.get(i).charAt(j) != 'B') count1++;
                    if (inputStrings.get(i).charAt(j) != 'W') count2++;
                }
            }
        }

        return Math.min(count1, count2);
    }
}
