package src.problem;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Problem1000 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        // sumAToB 메서드 사용
        // int result = sumAToB(a,b);

        // sumAToB 메서드 대신 람다식 사용
        BiFunction<Integer, Integer, Integer> sumAToB = (x, y) -> x + y;

        int result = sumAToB.apply(a, b);
        System.out.println(result);
    }

    public static int sumAToB(int a, int b) {
        return a+b;
    }
}
