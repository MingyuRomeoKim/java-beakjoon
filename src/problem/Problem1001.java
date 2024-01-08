package src.problem;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Problem1001 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        // subtractAToB 메서드 사용
        //int result = subtractAToB(a,b);

        // subtractAToB 메서드 대신 람다식 사용
        BiFunction<Integer, Integer, Integer> subtractAToB = (x, y) -> x-y;

        int result = subtractAToB.apply(a,b);
        System.out.println(result);
    }

    public static int subtractAToB(int a, int b) {
        return a - b;
    }
}
