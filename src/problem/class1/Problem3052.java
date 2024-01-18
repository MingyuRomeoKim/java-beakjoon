package src.problem.class1;

import java.io.*;
import java.util.Hashtable;

/**
 * https://www.acmicpc.net/problem/3052
 */
public class Problem3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        final int QuestionNumber = 42;
        int number, remain, beforeValue;
        char remainChar;
        Hashtable<Character, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < 10; i++) {
            number = Integer.parseInt(reader.readLine());
            remain = number % QuestionNumber;
            remainChar = (char) (remain + '0');
            if (!hashtable.containsKey(remainChar)) {
                hashtable.put(remainChar, 1);
            } else {
                beforeValue = hashtable.get(remainChar);
                hashtable.put(remainChar, beforeValue + 1);
            }
        }

        writer.write(String.valueOf(hashtable.size()));
        writer.flush();

        reader.close();
        writer.close();
    }
}
