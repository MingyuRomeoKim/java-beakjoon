package src.problem.bronze;

import java.io.*;
import java.util.Scanner;

/**
 * 부산일과학고등학교의 효진이는 수학의 귀재이다. 어떤 문제라도 보면 1분 내에 풀어버린다는 학교의 전설이 내려올 정도였는데, 이런 킹ㅡ갓 효진에게도 고민이 생겼다. 대부분의 문제에서 반복되는 연산이 있었기 때문이다! 이 연산은 너무 길어서 종이에 풀던 효진이는 너무 고통스러워서, 자신이 새로 연산자를 만들기로 했다.
 * 연산자의 기호는 ＠으로, A＠B = (A+B)×(A-B)으로 정의내리기로 했다.
 * <p>
 * 입 : 첫째 줄에 A, B가 주어진다. (1 ≤ A, B ≤ 100,000)
 * 출 : 첫째 줄에 A＠B의 결과를 출력한다.
 */
public class Problem15964 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();
        Scanner scanner = new Scanner(readLineString);
        long a = scanner.nextInt();
        long b = scanner.nextInt();

        long result = getSolution(a, b);

        writer.write(String.valueOf(result));
        writer.flush();

        reader.close();
        writer.close();
    }

    private static long getSolution(long a, long b) {
        return (a + b) * (a - b);
    }
}
