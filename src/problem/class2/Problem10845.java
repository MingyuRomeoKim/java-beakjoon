package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/10845
 */
public class Problem10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int roofCount = Integer.parseInt(reader.readLine());
        NewQueue newQueue = new NewQueue(roofCount);

        for (int i = 0; i < roofCount; i++) {
            String inputString = reader.readLine();
            int answer = getAnswer(inputString, newQueue);
            if (answer > -2) {
                writer.write(String.valueOf(answer));
                writer.write("\n");
            }
        }

        reader.close();
        writer.flush();
        writer.close();
    }

    private static int getAnswer(String inputString, NewQueue newQueue) {
        int answer = -2;

        String[] inputArrays = inputString.split(" ");
        String command = inputArrays[0];

        switch (command) {
            case "push":
                int number = Integer.parseInt(inputArrays[1]);
                newQueue.push(number);
                break;
            case "pop":
                answer = newQueue.pop();
                break;
            case "size":
                answer = newQueue.size();
                break;
            case "empty":
                answer = newQueue.empty();
                break;
            case "front":
                answer = newQueue.front();
                break;
            case "back":
                answer = newQueue.back();
                break;
        }
        return answer;
    }
}


class NewQueue {
    int[] queue;
    int frontIndex;
    int backIndex;

    public NewQueue(int queueLength) {
        queue = new int[queueLength];
        frontIndex = 0;
        backIndex = 0;
    }

    public void push(int x) {
        queue[backIndex] = x;
        backIndex++;
    }

    public int pop() {
        if (empty() == 1) {
            return -1;
        }

        int returnValue = queue[frontIndex];
        frontIndex++;
        return returnValue;
    }

    public int size() {
        return backIndex - frontIndex;
    }

    public int empty() {
        return size() == 0 ? 1 : 0;
    }

    public int front() {
        return empty() == 1 ? -1 : queue[frontIndex];
    }

    public int back() {
        return empty() == 1 ? -1 : queue[backIndex - 1];
    }
}