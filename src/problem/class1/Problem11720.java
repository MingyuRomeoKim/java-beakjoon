package src.problem.class1;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/11720
 */
public class Problem11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(reader.readLine());
        String lineString = reader.readLine();

        int totalSum = 0, lineInt = 0;

        for (int i = 0; i < number; i++) {
            lineInt = lineString.charAt(i) - '0';
            totalSum += lineInt;
        }
        writer.write(String.valueOf(totalSum));
        writer.flush();

        reader.close();
        writer.close();
    }
}
