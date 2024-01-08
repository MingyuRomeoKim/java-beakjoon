package src.problem;

import java.util.Scanner;

public class Problem1000 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int result = sumAToB(a,b);
        System.out.println(result);
    }

    public static int sumAToB(int a, int b) {
        return a+b;
    }
}
