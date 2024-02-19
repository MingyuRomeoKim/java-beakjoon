package src.problem.class3;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/11723
 */
public class Problem11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(reader.readLine());
        NewArray newArray = new NewArray();
        for (int i = 0; i < testCase; i++) {
            String inputString = reader.readLine();
            int answer = getAnswer(inputString, newArray);
            if (answer > -2) {
                writer.write(answer + "\n");
            }
        }
        reader.close();
        writer.flush();
        writer.close();
    }

    private static int getAnswer(String inputString, NewArray newArray) {
        String[] dumpArray = inputString.split(" ");
        String command = dumpArray[0];
        int number = 0, answer = -2;
        if (!command.equals("all") && !command.equals("empty")) {
            number = Integer.parseInt(dumpArray[1]);
        }
        switch (command) {
            case "add":
                newArray.add(number);
                break;
            case "remove":
                newArray.remove(number);
                break;
            case "check":
                answer = newArray.check(number);
                break;
            case "toggle":
                newArray.toggle(number);
                break;
            case "all":
                newArray.all();
                break;
            case "empty":
                newArray.empty();
                break;
        }

        return answer;
    }
}

class NewArray {
    private int set = 0;

    protected void add(int number) {
        set |= (1 << (number - 1));
    }

    protected void remove(int number) {
        set &= ~(1 << (number - 1));
    }

    protected int check(int number) {
        return (set & (1 << (number - 1))) != 0 ? 1 : 0;
    }

    protected void toggle(int number) {
        set ^= (1 << (number - 1));
    }

    protected void all() {
        set = (1 << 20) - 1;
    }

    protected void empty() {
        set = 0;
    }
}