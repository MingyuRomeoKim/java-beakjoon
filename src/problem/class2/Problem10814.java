package src.problem.class2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.acmicpc.net/problem/10814
 */
public class Problem10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int roofCount = Integer.parseInt(reader.readLine());
        String[][] members = new String[roofCount][2];

        for (int i = 0; i < roofCount; i++) {
            String[] inputArrays = reader.readLine().split(" ");
            members[i][0] = inputArrays[0];
            members[i][1] = inputArrays[1];
        }
        reader.close();

        Arrays.sort(members, Comparator.comparingInt((String[] member) -> Integer.parseInt(member[0])));
        Arrays.stream(members).forEach(member -> {
            try {
                writer.write(member[0] + " " + member[1] + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        writer.flush();
        writer.close();
    }
}
