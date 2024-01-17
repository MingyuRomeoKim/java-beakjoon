package src.problem.bronze;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Problem1271 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        BigInteger n, m;
        n = getBigInteger(sc);
        m = getBigInteger(sc);

        BigInteger[] result = n.divideAndRemainder(m);

        System.out.println(result[0]); // 몫
        System.out.println(result[1]); // 나머지
    }

    private static BigInteger getBigInteger(Scanner sc) {
        while (true) {
            try {
                BigInteger number = sc.nextBigInteger();
                if (number.compareTo(BigInteger.ONE) >= 0) {
                    return number;
                } else {
                    System.out.println("1 이상의 정수만 입력 가능합니다.");
                }
            } catch (InputMismatchException e) {
                System.out.println("정수만 입력 가능합니다.");
                sc.nextLine(); // 입력 버퍼를 비웁니다.
            }
        }
    }
}
