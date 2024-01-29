package src.problem.class2;
import java.io.*;
import java.util.ArrayList;
import java.util.Stack;

public class Problem1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeatNumber = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();
        ArrayList<String> operations = new ArrayList<>();

        int nextPushNumber = 1;
        boolean isSequencePossible = true;

        for (int i = 0; i < repeatNumber && isSequencePossible; i++) {
            int targetNumber = Integer.parseInt(reader.readLine());

            while (stack.isEmpty() || stack.peek() < targetNumber) {
                operations.add("+");
                stack.push(nextPushNumber++);
            }

            if (stack.peek().equals(targetNumber)) {
                operations.add("-");
                stack.pop();
            } else {
                operations.clear();
                operations.add("NO");
                isSequencePossible = false;
            }
        }

        for (String operation : operations) {
            writer.write(operation);
            writer.newLine();
        }
        writer.flush();
        writer.close();
        reader.close();
    }
}
