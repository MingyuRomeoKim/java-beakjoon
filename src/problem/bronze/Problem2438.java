package src.problem.bronze;

import java.util.Scanner;

public class Problem2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        Solution2438 solution2438 = (i -> {
            for (int x = 0; x < i; x++) {
                for (int y = 0; y <= x; y++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        });

       solution2438.printStar(number);
    }
}

interface Solution2438 {
    void printStar(int i);
}