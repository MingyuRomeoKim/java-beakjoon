package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2292
 */
public class Problem2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNumber = Integer.parseInt(reader.readLine());
        int answer = getAnswer(inputNumber);

        writer.write(String.valueOf(answer));
        writer.flush();
        reader.close();
        writer.close();
    }

    private static int getAnswer(int inputNumber) {
        int answer = inputNumber == 1 ? 1 : 2;
        int beeHouse = 6; // 벌집 6각형
        int initNumber = 2; // 초기 2
        int nextNumber = 8; // 3번째 시작

        for (int i = 2; i <= inputNumber; i ++) {
            if (i == nextNumber) {
                answer++;
                nextNumber = nextNumber + (beeHouse * initNumber);
                initNumber++;
            }
        }

        return answer;
    }
}
