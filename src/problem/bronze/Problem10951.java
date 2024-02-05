package src.problem.bronze;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 입 : 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 *      각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 출 : 각 테스트 케이스마다 A+B를 출력한다.
 */
public class Problem10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b ;
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        while (true) {
            if (!scanner.hasNext()) {
                scanner.close();
                break;
            }
            a = scanner.nextInt();
            b = scanner.nextInt();
            integerArrayList.add(a + b);
        }

        for (int i: integerArrayList) {
            System.out.println(i);
        }
    }
}
