package src.problem.class2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.acmicpc.net/problem/10816
 */
public class Problem10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        String[] nArray = reader.readLine().split(" ");
        int m = Integer.parseInt(reader.readLine());
        String[] mArray = reader.readLine().split(" ");
        reader.close();

        Map<String, Integer> cardCountMap = new HashMap<>();
        for (String card : nArray) {
            cardCountMap.put(card, cardCountMap.getOrDefault(card, 0) + 1);
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String target : mArray) {
            stringBuilder.append(cardCountMap.getOrDefault(target, 0)).append(" ");
        }

        writer.write(stringBuilder.toString().trim());
        writer.flush();
        writer.close();
    }
}
