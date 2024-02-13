package src.problem.class2;

import java.io.*;
import java.util.Stack;

/**
 * https://www.acmicpc.net/problem/4949
 */
public class Problem4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputString;

        while (!(inputString = reader.readLine()).equals(".")) {
            inputString = inputString.trim();
            String answer = getAnswer(inputString);
            writer.write(answer + "\n");
        }

        reader.close();
        writer.flush();
        writer.close();
    }

    private static String getAnswer(String inputString) {

        String newString = inputString.replaceAll("[^()\\[\\]]", "");

        Stack<Character> stack = new Stack<>();

        for (char character : newString.toCharArray()) {
            if (character == '(' || character == '[') {
                stack.push(character);
            }else if (character == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return "no";
                }
            }else if (character == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return "no";
                }
            }
        }

        return stack.isEmpty() ? "yes" : "no";
    }
}
