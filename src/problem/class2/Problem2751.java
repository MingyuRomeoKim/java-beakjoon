package src.problem.class2;

import java.io.*;
import java.util.LinkedList;

/**
 * https://www.acmicpc.net/problem/2751
 */
public class Problem2751 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberLength = Integer.parseInt(reader.readLine());

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < numberLength; i++) {
            linkedList.add(Integer.parseInt(reader.readLine()));
        }

        linkedList.sort(Integer::compare);

        linkedList.forEach(e -> {
            try {
                writer.write(String.valueOf(e));
                writer.write("\n");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        writer.flush();
        writer.close();
        reader.close();
    }
}
