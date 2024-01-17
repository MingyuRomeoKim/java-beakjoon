package src.problem.bronze;

import java.io.*;

/**
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 *
 * 입 : 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
 * 출 : 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
 */
public class Problem11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();
        int ascii = readLineString.charAt(0);

        writer.write(String.valueOf(ascii));
        writer.flush();

        reader.close();
        writer.close();
    }
}
