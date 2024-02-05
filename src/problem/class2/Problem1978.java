package src.problem.class2;

import java.io.*;

public class Problem1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputInteger = Integer.parseInt(reader.readLine());
        String inputString = reader.readLine();
        String[] inputArray = inputString.split(" ");

        int answer = 0;
        for (String number: inputArray) {
            if (isPrime(Integer.parseInt(number))) {
                answer++;
            }
        }

        writer.write(String.valueOf(answer));
        writer.flush();
        reader.close();
        writer.close();
    }

    private static boolean isPrime(int number) {
        if (number == 1) return false;

        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
