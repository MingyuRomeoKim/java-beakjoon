package src.problem.bronze;

import java.io.*;

/**
 * 단어 S와 정수 i가 주어졌을 때, S의 i번째 글자를 출력하는 프로그램을 작성하시오.
 *
 * 입 : 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어 S가 주어진다. 단어의 길이는 최대 1,000이다.
 * 출 : 둘째 줄에 정수i가 주어진다
 */
public class Problem27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();
        int i = Integer.parseInt(reader.readLine());

        char result = readLineString.charAt(i -1);
        writer.write(result);
        writer.flush();

        reader.close();
        writer.close();
    }
}
