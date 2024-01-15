package src.problem;

import java.util.Scanner;

public class Problem2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;

        a = sc.nextLong();
        b = sc.nextLong();

        Solution solution = (x, y) -> Math.abs(x - y);

        long result = solution.result(a, b);
        System.out.println(result);
    }
}

@FunctionalInterface
interface Solution {
    long result(long x, long y);
}

