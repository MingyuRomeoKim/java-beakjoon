package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/7568
 */
public class Problem7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int roofCount = Integer.parseInt(reader.readLine());
        String[] heightAndWeights = new String[roofCount];

        for (int i = 0; i < roofCount; i++) {
            heightAndWeights[i] = reader.readLine();
        }
        reader.close();

        int[] answers = getAnswer(heightAndWeights);

        for (int i = 0; i < answers.length; i++) {
            writer.write(String.valueOf(answers[i]));

            if (i < answers.length - 1) {
                writer.write(" ");
            }
        }
        writer.flush();
        writer.close();
    }

    private static int[] getAnswer(String[] heightAndWeights) {
        int length = heightAndWeights.length;
        int[][] people = new int[length][2];
        int[] ranks = new int[length];

        // 입력 데이터 파싱
        for (int i = 0; i < length; i++) {
            String[] hw = heightAndWeights[i].split(" ");
            people[i][0] = Integer.parseInt(hw[0]);
            people[i][1] = Integer.parseInt(hw[1]);
        }

        // 덩치 비교 및 등수 계산
        for (int i = 0; i < length; i++) {
            int rank = 1;
            for (int j = 0; j < length; j++) {
                if (i != j && people[i][0] < people[j][0] && people[i][1] < people[j][1]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }

        return ranks;
    }
}
