package src.problem.bronze;

import java.io.*;

/**
 * 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
 *
 * 입 : 자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
 * 출 : 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
 */
public class Problem9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(reader.readLine());

        String readLineString;
        int firstIndex = 0, lastIndex ;

        for (int i = 0; i < number; i++) {
            readLineString = reader.readLine();
            lastIndex = readLineString.length() - 1;
            writer.write(readLineString.charAt(firstIndex));
            writer.write(readLineString.charAt(lastIndex));
            writer.write("\n");
        }

        writer.flush();

        reader.close();
        writer.close();
    }
}
