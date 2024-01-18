package src.problem.class1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/1152
 */
public class Problem1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(readLineString, " ");

        writer.write(String.valueOf(tokenizer.countTokens()));
        writer.flush();

        reader.close();
        writer.close();
    }
}
