package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2775
 */
public class Problem2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(reader.readLine());

        for (int x = 0; x < testCase; x++) {
            int k = Integer.parseInt(reader.readLine());
            int n = Integer.parseInt(reader.readLine());

            int underFloor = k - 1;
            int totalPeople = 0;
            for (int i = 1; i <= n; i++) {
                totalPeople += getUnderFloorTotalPeopleCount(i,underFloor);
            }

            writer.write(String.valueOf(totalPeople));
            writer.write("\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }

    private static int getUnderFloorTotalPeopleCount(int i, int underFloor) {
        // 기저 조건: 0층일 경우 호수(i) 만큼의 사람이 살고 있음
        if (underFloor == 0) {
            return i;
        }

        // 현재 층의 사람 수는 아래 층의 1호부터 i호까지 사람들의 합
        int total = 0;
        for (int j = 1; j <= i; j++) {
            total += getUnderFloorTotalPeopleCount(j, underFloor - 1);
        }
        return total;
    }
}
