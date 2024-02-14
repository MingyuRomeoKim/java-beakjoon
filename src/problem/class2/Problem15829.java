package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/15829
 */
public class Problem15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(reader.readLine());
        String string = reader.readLine();
        reader.close();

        int[] newInt = new int[length];
        for (int i = 0; i < length; i++) {
            newInt[i] = getChangeCharToInt(string.charAt(i));
        }

        String answer = getAnswer(newInt,length);
        writer.write(answer);
        writer.flush();
        writer.close();
    }

    private static String getAnswer(int[] newInt, int length) {
        final int r = 31;
        final int m = 1234567891;

        long answerInt = 0;

        for (int i = 0; i < length; i++) {
            long number = newInt[i];
            answerInt = (answerInt + (number * modularPow(r, i, m))) % m;
        }

        return String.valueOf(answerInt % m);
    }

    private static long modularPow(int base, int exponent, int modulus) {
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result = (result * base) % modulus;
        }
        return result;
    }
    private static int getChangeCharToInt(char c) {
        return (int) c - 96;
    }
}
