package src.problem.class1;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2920
 */
public class Problem2920 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();
        readLineString = readLineString.replaceAll(" ","");
        String answer = "mixed";

        if (readLineString.startsWith("1")) {
            answer = checkAscending(readLineString);
        }else if (readLineString.startsWith("8")) {
            answer = checkDescending(readLineString);
        }
        writer.write(answer);
        writer.flush();
        reader.close();
        writer.close();
    }

    private static String checkAscending(String readLineString) {
        String returnAnswer = "ascending";
        char iChar;
        for (int i = 1; i <= 8; i++) {
            iChar = String.valueOf(i).charAt(0);
            if (readLineString.charAt(i - 1) != iChar) {
                returnAnswer = "mixed";
                break;
            }
        }
        return  returnAnswer;
    }

    private static String checkDescending(String readLineString) {
        String returnAnswer = "descending";
        char jChar;
        int j = 8;
        for (int i = 1; i <= 8; i++) {
            jChar = String.valueOf(j).charAt(0);
            if (readLineString.charAt(i - 1) != jChar) {
                returnAnswer = "mixed";
                break;
            }
            j--;
        }
        return  returnAnswer;
    }
}
