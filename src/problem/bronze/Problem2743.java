package src.problem.bronze;

import java.io.*;

/**
 * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
 *
 * 입 : 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 * 출 : 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
 */
public class Problem2743 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();

        writer.write(String.valueOf(readLineString.length()));
        writer.flush();

        reader.close();
        writer.close();
    }
}
