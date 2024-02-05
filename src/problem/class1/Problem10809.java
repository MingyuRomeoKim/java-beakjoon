package src.problem.class1;

import java.io.*;
/**
 * https://www.acmicpc.net/problem/10809
 */
public class Problem10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();

        for (char i = 'a'; i <= 'z'; i++) {
            writer.write(String.valueOf(readLineString.indexOf(i)));
            writer.write(" ");
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
