package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/10828
 */
public class Problem10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalCommandCount = Integer.parseInt(reader.readLine());

        NewStack newStack = new NewStack(totalCommandCount);

        for (int i = 0; i < totalCommandCount; i++) {
            String command = reader.readLine();

            int output = getOutput(newStack, command);

            if (output != -2) {  // 'push' 명령의 경우 출력하지 않음
                writer.write(output + "\n");
            }
        }
        writer.flush();
        reader.close();
        writer.close();
    }

    private static int getOutput(NewStack newStack, String command) {
        int output = -1;

        if (command.startsWith("push")) {
            String[] pushTexts = command.split(" ");
            if (pushTexts.length > 1) {
                int number = Integer.parseInt(pushTexts[1]);
                newStack.push(number);
                return -2;
            }
        }

        if (command.startsWith("pop")) {
            output = newStack.pop();
        }

        if (command.startsWith("size")) {
            output = newStack.size();
        }

        if (command.startsWith("empty")) {
            output = newStack.empty();
        }

        if (command.startsWith("top")) {
            output = newStack.top();
        }
        return output;
    }
}

class NewStack {
    int[] value;
    int lastIndex;

    public NewStack(int number) {
        value = new int[number];
        lastIndex = 0;
    }

    public void push(int number) {
        value[lastIndex] = number;
        lastIndex++;
    }

    public int pop() {
        if (lastIndex == 0) return -1;

        lastIndex--;
        return value[lastIndex];
    }

    public int top() {
        return lastIndex > 0 ? value[lastIndex - 1] : -1;
    }

    public int empty() {
        return lastIndex == 0 ? 1 : 0;
    }

    public int size() {
        return lastIndex;
    }
}
