package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/9012
 */
public class Problem9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int roofCount = Integer.parseInt(reader.readLine());

        for (int i = 0; i < roofCount; i++) {
            String inputString = reader.readLine();
            String answer = getAnswer(inputString);
            writer.write(answer + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }

    private static String getAnswer(String inputString) {
        String answer = "NO";
        boolean flag = true;
        
        inputString = inputString.trim();

        while (flag) {
            if (inputString.contains("()")) {
                inputString = inputString.replace("()","");
            } else {
                flag = false;
            }
        }

        if (inputString.length() == 0) {
            answer = "YES";
        }

        return answer;
    }
}
