package src.problem;

import java.util.Scanner;

public class Problem1001 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int result = subtractAToB(a,b);
        System.out.println(result);
    }

    public static int subtractAToB(int a , int b)
    {
        return a - b;
    }
}
