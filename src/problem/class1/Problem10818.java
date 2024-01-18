package src.problem.class1;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/10818
 */
public class Problem10818 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberCount = Integer.parseInt(reader.readLine());
        String[] readLineArray = reader.readLine().split(" ");

        int minNumber = getMinNumber(numberCount,readLineArray);
        int maxNumber = getMaxNumber(numberCount,readLineArray);

        writer.write(String.valueOf(minNumber));
        writer.write(" ");
        writer.write(String.valueOf(maxNumber));
        writer.flush();

        reader.close();
        writer.close();
    }

    private static int getMinNumber(int numberCount, String[] readLineArray) {
        int number = Integer.MAX_VALUE;
        int lineNumber;
        for (int i = 0; i < numberCount; i++) {
            lineNumber = Integer.parseInt(readLineArray[i]);
            if (number > lineNumber) {
                number = lineNumber;
            }
        }
        return number;
    }

    private static int getMaxNumber(int numberCount, String[] readLineArray) {
        int number = Integer.MIN_VALUE;
        int lineNumber;
        for (int i = 0; i < numberCount; i++) {
            lineNumber = Integer.parseInt(readLineArray[i]);
            if (number < lineNumber) {
                number = lineNumber;
            }
        }
        return number;
    }
}
