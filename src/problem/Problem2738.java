package src.problem;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2738 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] nArray = new int[n][m], mArray = new int[n][m], resultArray = new int[n][m];

//        Solution2738 solution2738 = ((n1, m1, scanner1) -> {
//            int[][] returnArray = new int[n1][m1];
//
//            for (int i = 0; i < n1; i++) {
//                for (int j = 0; j < m; j++) {
//                    returnArray[i][j] = scanner1.nextInt();
//                }
//            }
//
//            return returnArray;
//        });

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultArray[i][j] = nArray[i][j] + mArray[i][j];
            }
        }

        Arrays.stream(resultArray)
                .map(row -> Arrays.stream(row)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(" ")))
                .forEach(System.out::println);
    }
}

interface Solution2738 {
    int[][] getArray(int n, int m, Scanner scanner);
}
