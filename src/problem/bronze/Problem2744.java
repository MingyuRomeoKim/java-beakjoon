package src.problem.bronze;

import java.io.*;

/**
 * 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 *
 * 입 : 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 * 출 : 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
 */
public class Problem2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();
        char[] resultChar = new char[readLineString.length()];

        for (int i = 0; i < readLineString.length(); i++) {
            char dumpChar = readLineString.charAt(i);
            if (Character.isUpperCase(dumpChar)) {
                resultChar[i] = Character.toLowerCase(dumpChar);
            } else {
                resultChar[i] = Character.toUpperCase(dumpChar);
            }
        }

        for (char value: resultChar) {
            writer.write(value);
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}
