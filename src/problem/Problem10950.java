package src.problem;

import java.util.Scanner;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출 : 각 테스트 케이스마다 A+B를 출력한다.
 */
public class Problem10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a, b;
        int[] result = new int[t];

        for (int i = 0; i < t; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            result[i] = a + b;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
