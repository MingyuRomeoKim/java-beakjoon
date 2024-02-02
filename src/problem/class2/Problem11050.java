package src.problem.class2;

import java.io.*;
import java.util.Arrays;

public class Problem11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = numbers[0];
        int k = numbers[1];

        int answer = getBinomialCoefficient(n, k);

        writer.write(String.valueOf(answer));
        writer.flush();
        reader.close();
        writer.close();
    }

    private static int getBinomialCoefficient(int n, int k) {
        return (int) (getFactorial(n) / (getFactorial(k) * getFactorial(n - k)));
    }

//    private static long getFactorial(int number) {
//        return number == 1 ? number : number * getFactorial(number - 1);
//    }

    private static long getFactorial(int number) {
        long answer = 1;
        for (int i = number; i > 1; i--) {
            answer *= i;
        }
        return answer;
    }
}
