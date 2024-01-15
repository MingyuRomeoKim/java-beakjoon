package src.problem;

import java.util.Scanner;

public class Problem2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first,second,third,fourth,fifth;

        first = scanner.nextInt();
        second = scanner.nextInt();
        third = scanner.nextInt();
        fourth = scanner.nextInt();
        fifth = scanner.nextInt();

        Solution2475 solution2475 = (firstParameter, secondParameter, thirdParameter, fourthParameter, fifthParameter) -> {
            int firstSquareNumber = (int) Math.pow(firstParameter,2);
            int secondSquareNumber = (int) Math.pow(secondParameter,2);
            int thirdSquareNumber = (int) Math.pow(thirdParameter,2);
            int fourthSquareNumber = (int) Math.pow(fourthParameter,2);
            int fifthSquareNumber = (int) Math.pow(fifthParameter,2);

            int sumTotalSquareNumber = firstSquareNumber + secondSquareNumber + thirdSquareNumber + fourthSquareNumber + fifthSquareNumber;

            return sumTotalSquareNumber % 10;

        };

        int result = solution2475.printCheckNumber(first,second,third,fourth,fifth);
        System.out.println(result);
    }
}

interface Solution2475 {
    int printCheckNumber(int firstParameter, int secondParameter, int thirdParameter, int fourthParameter, int fifthParameter);
}