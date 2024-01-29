package src.problem.class2;

import java.io.*;
import java.util.Arrays;

public class Problem1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        String[] nNumbers = reader.readLine().split(" ");
        nNumbers = Arrays.stream(nNumbers).sorted().toArray(String[]::new);

        int m = Integer.parseInt(reader.readLine());
        String[] mNumbers = reader.readLine().split(" ");

        for (String mNumber:mNumbers) {
            if (searchList(nNumbers,mNumber)) {
                writer.write("1");
            } else {
                writer.write("0");
            }
            writer.write("\n");
        }
        writer.flush();
        writer.close();
        reader.close();
    }

    private static boolean searchList(String[] strings, String searchString) {
        int index = Arrays.binarySearch(strings, searchString);
        return index >= 0;
    }
}
