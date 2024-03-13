package src.problem.class3;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/1764
 */
public class Problem1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] inputArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cantSeePeopleCount = inputArray[0];
        int cantHearPeopleCount = inputArray[1];

        Set<String> cantSeeSet = new HashSet<>();
        List<String> resultList = new ArrayList<>();

        for (int i = 0; i < cantSeePeopleCount; i++) {
            cantSeeSet.add(reader.readLine());
        }

        for (int i = 0; i < cantHearPeopleCount; i++) {
            String input = reader.readLine();

            if (cantSeeSet.contains(input)) {
                resultList.add(input);
            }
        }

        Collections.sort(resultList);

        writer.write(resultList.size() + "\n");
        for (String name : resultList) {
            writer.write(name + "\n");
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
