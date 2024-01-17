package src.problem;

import java.util.Scanner;

/**
 * 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * 입 : 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
 * 출 : 첫째 줄에 N!을 출력한다.
 */
public class Problem10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = getSolution(n);
        System.out.println(result);
    }

    private static int getSolution(int n) {
        if (n > 1) return n * getSolution(n-1);
        else return 1;
    }
}
