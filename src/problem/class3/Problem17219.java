package src.problem.class3;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.acmicpc.net/problem/17219
 */
public class Problem17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] caseArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int inputCase = caseArray[0];
        int questionCase = caseArray[1];

        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < inputCase; i++) {
            String[] inputString = reader.readLine().split(" ");
            map.put(inputString[0], inputString[1]);
        }

        for (int i = 0; i < questionCase; i++) {
            String domain = reader.readLine();
            String answer = getAnswer(domain,map);
            writer.write(answer + "\n");
        }
        reader.close();
        writer.flush();
        writer.close();
    }

    private static String getAnswer(String domain, Map<String, String> map) {
        return map.get(domain);
    }
}
