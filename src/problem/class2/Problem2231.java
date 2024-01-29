package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2231
 */
public class Problem2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNumber = Integer.parseInt(reader.readLine());
        int answer = getAnswer(inputNumber);

        writer.write(String.valueOf(answer));
        writer.flush();
        writer.close();
        reader.close();
    }

    private static int getAnswer(int inputNumber) {
        int answer = 0;

        for (int i = 1; i < inputNumber; i++) {
            int sum = getSum(i);
            if (sum == inputNumber) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    private static int getSum(int number) {
        int sum = number;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
