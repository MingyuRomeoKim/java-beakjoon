package src.problem.bronze;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Problem1008 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        BiFunction<Integer, Integer, Double> divide = (x, y) -> {
            if (x < 1 || y < 1) {
                throw new ArithmeticException("Division by zero");
            }

            return (double) x / y;
        };

        double result = divide.apply(a, b);
        System.out.println(result);
    }

}
