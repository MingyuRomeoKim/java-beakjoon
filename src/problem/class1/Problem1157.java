package src.problem.class1;

import java.io.*;
import java.util.Hashtable;
import java.util.Map;

/**
 * https://www.acmicpc.net/problem/1157
 */
public class Problem1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine().toUpperCase();
        char maxUsedCharacter = getSolution(readLineString);

        writer.write(String.valueOf(maxUsedCharacter));
        writer.flush();
        reader.close();
        writer.close();
    }

    private static char getSolution(String readLineString) {
        Hashtable<Character,Integer> hashtable =  getHashTableData(readLineString);


        int maxUsedCharacterCount = Integer.MIN_VALUE;
        char maxUsedCharacter = '?';

        for (Map.Entry<Character,Integer> item: hashtable.entrySet()) {

            if (item.getValue() == maxUsedCharacterCount) {
                maxUsedCharacter = '?';
            } else {
                if (item.getValue() > maxUsedCharacterCount) {
                    maxUsedCharacterCount = item.getValue();
                    maxUsedCharacter = item.getKey();
                }
            }

        }

        return maxUsedCharacter;
    }

    private static Hashtable<Character,Integer> getHashTableData(String readLineString) {
        Hashtable<Character, Integer> hashtable = new Hashtable<Character, Integer>();

        char oneChar;
        for (int i = 0; i < readLineString.length(); i++) {
            oneChar = readLineString.charAt(i);
            if (!hashtable.containsKey(oneChar)) {
                hashtable.put(oneChar, 1);
            } else {
                int nowCount = hashtable.get(oneChar);
                hashtable.replace(oneChar, nowCount + 1);
            }
        }
        return hashtable;
    }
}
