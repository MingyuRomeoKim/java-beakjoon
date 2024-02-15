package src.problem.class2;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/2108
 */
public class Problem2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int roofCount = Integer.parseInt(reader.readLine());
        int[] numbers = new int[roofCount];
        for (int i = 0; i < roofCount; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        Arrays.sort(numbers);

        writer.write(String.valueOf(getArithmeticMean(numbers)));
        writer.write("\n");

        writer.write(String.valueOf(getMiddleValue(numbers)));
        writer.write("\n");

        writer.write(String.valueOf(getMaximumFrequency(numbers)));
        writer.write("\n");

        writer.write(String.valueOf(getRange(numbers)));
        writer.write("\n");

        writer.flush();
        writer.close();
    }

    private static int getRange(int[] numbers) {
        return numbers[numbers.length - 1] - numbers[0];
    }

    private static int getMaximumFrequency(int[] numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort((e1, e2) -> {
            int freqCompare = e2.getValue().compareTo(e1.getValue());
            if (freqCompare == 0) {
                return e1.getKey().compareTo(e2.getKey()); // 빈도수가 같으면 숫자에 따라 오름차순
            }
            return freqCompare; // 빈도수에 따라 내림차순
        });

        // 최빈값 중 두 번째로 작은 값 찾기
        int maxFrequency = sortedEntries.get(0).getValue();
        int answer = sortedEntries.get(0).getKey();
        if (sortedEntries.size() > 1 && sortedEntries.get(1).getValue() == maxFrequency) {
            answer = sortedEntries.get(1).getKey();
        }

        return answer;
    }

    private static int getMiddleValue(int[] numbers) {
        return numbers[numbers.length / 2];
    }

    private static int getArithmeticMean(int[] numbers) {
        return Math.round( Arrays.stream(numbers).sum() / (float) numbers.length);
    }
}
