package src.problem.class2;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/4153
 */
public class Problem4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        final String ExitKeyword = "0 0 0";
        String inputString = "";

        while (true) {
            inputString = reader.readLine();
            if (inputString.equals(ExitKeyword)) {
                break;
            }
            writer.write(getAnswer(inputString) + "\n");
        }

        writer.flush();
        reader.close();
        writer.close();
    }

    private static String getAnswer(String inputString) {
        String answer = "wrong";

        int[] numbers = Arrays.stream(inputString.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];
        boolean isRightTriangle = ((a * a) + (b * b)) == (c * c);

        if (isRightTriangle) {
            answer = "right";
        }
        return answer;
    }
}
