package src.problem.bronze;

import java.io.*;

/**
 * 어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
 * A+: 4.3, A0: 4.0, A-: 3.7
 * B+: 3.3, B0: 3.0, B-: 2.7
 * C+: 2.3, C0: 2.0, C-: 1.7
 * D+: 1.3, D0: 1.0, D-: 0.7
 * F: 0.0
 *
 * 입 : 첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다.
 * 출 : 첫째 줄에 C언어 평점을 출력한다.
 */
public class Problem2754 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();
        String returnValue = getSolution(readLineString);

        writer.write(returnValue);
        writer.flush();

        reader.close();
        writer.close();
    }

    private static String getSolution (String grade) {
        String returnValue;
        switch (grade) {
            case "A+" :
                returnValue = "4.3";
                break;
            case "A0" :
                returnValue = "4.0";
                break;
            case "A-" :
                returnValue = "3.7";
                break;
            case "B+" :
                returnValue = "3.3";
                break;
            case "B0" :
                returnValue = "3.0";
                break;
            case "B-" :
                returnValue = "2.7";
                break;
            case "C+" :
                returnValue = "2.3";
                break;
            case "C0" :
                returnValue = "2.0";
                break;
            case "C-" :
                returnValue = "1.7";
                break;
            case "D+" :
                returnValue = "1.3";
                break;
            case "D0" :
                returnValue = "1.0";
                break;
            case "D-" :
                returnValue = "0.7";
                break;
            default:
                returnValue = "0.0";
                break;
        }

        return returnValue;
    }
}
