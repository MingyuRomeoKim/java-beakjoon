package src.problem.class2;

import java.io.*;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/2869
 */
public class Problem2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] questionArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        reader.close();

        int answer = getAnswer(questionArray);
        writer.write(String.valueOf(answer));
        writer.flush();
        writer.close();
    }

    private static int getAnswer(int[] questionArray) {
        int up = questionArray[0];
        int down = questionArray[1];
        int height = questionArray[2];

        // 마지막 날을 제외한 나머지 날들에 달팽이가 올라가야 하는 총 높이
        int remainingHeight = height - up;

        // 하루에 실제로 올라가는 높이
        int dailyClimb = up - down;

        // 올라가야 하는 날짜 계산
        int totalDays = 0;
        if (remainingHeight > 0) {
            // 나머지 높이를 하루에 올라가는 높이로 나누고, 나머지가 있다면 하루를 추가
            totalDays = remainingHeight / dailyClimb;
            if (remainingHeight % dailyClimb != 0) {
                totalDays++;
            }
        }

        // 마지막 날 추가
        return totalDays + 1;
    }
}
