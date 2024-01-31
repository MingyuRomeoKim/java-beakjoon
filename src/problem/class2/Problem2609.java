package src.problem.class2;

import java.io.*;
import java.util.Arrays;

public class Problem2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int i = numbers[0];
        int j = numbers[1];

        int gcd = getGCD(i, j);
        int lcm = getLCM(i, j);

        writer.write(String.valueOf(gcd));
        writer.write("\n");
        writer.write(String.valueOf(lcm));
        writer.flush();

        reader.close();
        writer.close();
    }

    /**
     * get greatest common divisor (최대공약수)
     */
    private static int getGCD(int i, int j) {
        if (j == 0) return i;
        return getGCD(j, i % j);
    }

    /**
     * least common multiple (최소공배수)
     */
    private static int getLCM(int i, int j) {
        return (i * j) / getGCD(i, j);
    }
}
