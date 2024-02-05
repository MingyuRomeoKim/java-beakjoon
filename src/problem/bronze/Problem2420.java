package src.problem.bronze;

import java.util.Scanner;

public class Problem2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;

        a = sc.nextLong();
        b = sc.nextLong();

        Solution2420 solution = (x, y) -> Math.abs(x - y);

        long result = solution.result(a, b);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Solution2420 {
    long result(long x, long y);
}

