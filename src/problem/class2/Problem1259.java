package src.problem.class2;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/1259
 */
public class Problem1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String readLineString;

        ArrayList<String> answers = new ArrayList<>();
        while (true) {
            readLineString = reader.readLine();
            if (readLineString.equals("0")) break;

            answers.add(isPalindrom(readLineString));
        }

        answers.forEach(answer -> {
            try {
                writer.write(answer);
                writer.write("\n");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        writer.flush();
        reader.close();
        writer.close();
    }

    private static String isPaleandrom(String inputString) {
        int length = inputString.length();

        for (int i = 0; i < length / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(length - i - 1)) {
                return "no";
            }
        }

        return "yes";
    }

    private static String isPaleandrom1(String inputString) {
        int length = inputString.length();
        ArrayList<Character> tempArrayList = new ArrayList<>();

        for (int i = 0; i < length / 2; i++) {
            tempArrayList.add(inputString.charAt(i));
        }

        int start = length % 2 == 0 ? length / 2 : length / 2 + 1;
        for (int i = start; i < length; i++) {
            char word = inputString.charAt(i);
            if (!tempArrayList.isEmpty() && word == tempArrayList.get(tempArrayList.size() - 1)) {
                tempArrayList.remove(tempArrayList.size() - 1);
            } else {
                return "no";
            }
        }

        return "yes";
    }
}
