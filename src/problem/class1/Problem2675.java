package src.problem.class1;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2675
 */
public class Problem2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCaseNumber = Integer.parseInt(reader.readLine());
        String readLineString;

        int repeatNumber;
        String repeatString;

        for (int i = 0; i < testCaseNumber; i++) {
            readLineString = reader.readLine();
            String[] readLineArray = readLineString.split(" ");
            repeatNumber = Integer.parseInt(readLineArray[0]);
            repeatString = readLineArray[1];

            String solution = getSolution(repeatNumber,repeatString);
            writer.write(solution);
            writer.write("\n");
        }

        writer.flush();
        reader.close();
        writer.close();
    }

    private static String getSolution(int repeatNumber, String repeatString) {
        StringBuilder returnString = new StringBuilder();

        for (int i = 0; i < repeatString.length(); i++) {
            for (int j = 0; j < repeatNumber; j++) {
                returnString.append(String.valueOf(repeatString.charAt(i)));
            }
        }
        return returnString.toString();
    }
}
