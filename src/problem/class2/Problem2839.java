package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2839
 */
public class Problem2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int needSugar = Integer.parseInt(reader.readLine());
        reader.close();

        int answer = getAnswer(needSugar);
        writer.write(String.valueOf(answer));
        writer.flush();
        writer.close();
    }

    private static int getAnswer(int needSugar) {
        final int ThreeSugar = 3;
        final int FiveSugar = 5;
        int answer = -1;

        for (int fiveBags = needSugar / FiveSugar; fiveBags >= 0; fiveBags--) {
            int remainingSugar = needSugar - (fiveBags * FiveSugar);

            if (remainingSugar % ThreeSugar == 0) {
                int threeBags = remainingSugar / ThreeSugar;
                answer = fiveBags + threeBags;
                break;
            }
        }

        return answer;
    }
}
