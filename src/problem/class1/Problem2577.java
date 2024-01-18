package src.problem.class1;

import java.io.*;
import java.util.Hashtable;

/**
 * https://www.acmicpc.net/problem/2577
 */
public class Problem2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int aValue = Integer.parseInt(reader.readLine());
        int bValue = Integer.parseInt(reader.readLine());
        int cValue = Integer.parseInt(reader.readLine());

        printAnswer(aValue,bValue,cValue,writer);

        writer.flush();
        reader.close();
        writer.close();
    }

    private static void printAnswer(int a, int b, int c, BufferedWriter writer) throws IOException {
        long multiplicationNumber = (long) a * b * c;
        String multiplicationString = String.valueOf(multiplicationNumber);
        Hashtable<Character,Integer> hashtable = getHashTableData(multiplicationString);

        for (int i = 0; i < 10; i++) {
            char iChar = Integer.toString(i).charAt(0);
            if (hashtable.containsKey(iChar)) {
                writer.write(String.valueOf(hashtable.get(iChar)));
            } else {
                writer.write('0');
            }
            writer.write("\n");
        }
    }

    private static Hashtable<Character,Integer> getHashTableData(String multiplicationString) {
        Hashtable<Character,Integer> hashtable = new Hashtable<>();

        char number;
        for (int i = 0; i < multiplicationString.length(); i++) {
            number = multiplicationString.charAt(i);
            if (!hashtable.containsKey(number)) {
                hashtable.put(number, 1);
            } else {
                int nowCount = hashtable.get(number);
                hashtable.replace(number, nowCount + 1);
            }
        }
        return hashtable;
    }
}

