package src.problem.bronze;

import java.io.*;
import java.util.ArrayList;

/**
 * 입 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 * 출 : 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 */
public class Problem15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String tString = bufferedReader.readLine();
        int tInteger = Integer.parseInt(tString);
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        String stringLine;
        for (int i = 0; i < tInteger; i++) {
            stringLine = bufferedReader.readLine();
            String stringLineArray[] = stringLine.split(" ");
            int a = Integer.parseInt(stringLineArray[0]);
            int b = Integer.parseInt(stringLineArray[1]);
            integerArrayList.add(a + b);
        }

        integerArrayList.forEach(e -> {
            try {
                bufferedWriter.write(e + "\n");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedWriter.flush();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
