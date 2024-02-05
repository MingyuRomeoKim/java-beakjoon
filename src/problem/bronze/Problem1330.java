package src.problem.bronze;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Problem1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b ;
        a = sc.nextInt();
        b = sc.nextInt();

        BiFunction<Integer,Integer,String> solution = (x,y) -> {
            return x > y ? ">" : x.equals(y) ? "==" : "<";
        };

        System.out.println(solution.apply(a,b));
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        String result = a > b ? ">" : a == b ? "==" : "<";
//        System.out.println(result);
//    }
}
