package src.problem.class2;

import java.io.*;
import java.util.Arrays;

public class Problem1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = Arrays.stream(reader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        reader.close();

        printPrime(writer,numbers);

        writer.flush();
        writer.close();
    }

    private static void printPrime(BufferedWriter writer,int[] number) throws IOException {
        int start = number[0];
        int end = number[1];

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                writer.write(String.valueOf(i));
                writer.write("\n");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number == 1) return false;

        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
