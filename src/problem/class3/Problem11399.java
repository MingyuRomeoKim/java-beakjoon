package src.problem.class3;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/11399
 */
public class Problem11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int peopleNumber = Integer.parseInt(reader.readLine());
        int[] waitingTime = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        reader.close();

        int answer = getAnswer(peopleNumber,waitingTime);
        writer.write(String.valueOf(answer));
        writer.flush();
        writer.close();
    }

    private static int getAnswer(int peopleNumber, int[] waitingTime) {
        int answer = 0;
        // 배열을 오름차순으로 정렬
        Arrays.sort(waitingTime);

        // 각 사람이 기다리는 시간의 합을 계산
        for (int i = 0; i < peopleNumber; i++) {
            for (int j = 0; j <= i; j++) {
                answer += waitingTime[j];
            }
        }
        return answer;
    }
}
