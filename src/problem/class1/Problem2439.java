package src.problem.class1;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2439
 */
public class Problem2439 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();
        int number = Integer.parseInt(readLineString);
        printStar(number,writer);

        writer.flush();
        reader.close();
        writer.close();
    }

    private static void printStar(int number,BufferedWriter writer) throws IOException{
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= number ; j++) {
                if (j >= i) {
                    writer.write("*");
                }else {
                    writer.write(" ");
                }
            }
            writer.write("\n");
        }
    }
}

