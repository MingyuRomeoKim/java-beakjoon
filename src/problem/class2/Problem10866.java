package src.problem.class2;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/10866
 */
public class Problem10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int roofCount = Integer.parseInt(reader.readLine());
        NewDeque newDeque = new NewDeque(roofCount);
        for (int i = 0; i < roofCount; i++) {
            int answer = getAnswer(reader.readLine(), newDeque);
            if (answer > -2) {
                writer.write(String.valueOf(answer));
                writer.write("\n");
            }
        }
        reader.close();
        writer.flush();
        writer.close();
    }

    private static int getAnswer(String inputString, NewDeque newDeque) {
        int answer = -2;
        int x;
        String[] inputArray = inputString.split(" ");
        String command = inputArray[0];

        switch (command) {
            case "push_front":
                x = Integer.parseInt(inputArray[1]);
                newDeque.push_front(x);
                break;
            case "push_back":
                x = Integer.parseInt(inputArray[1]);
                newDeque.push_back(x);
                break;
            case "pop_front":
                answer = newDeque.pop_front();
                break;
            case "pop_back":
                answer = newDeque.pop_back();
                break;
            case "size":
                answer = newDeque.size();
                break;
            case "empty":
                answer = newDeque.empty();
                break;
            case "front":
                answer = newDeque.front();
                break;
            case "back":
                answer = newDeque.back();
                break;
        }

        return answer;
    }
}

class NewDeque {
    int[] deque;
    int size, firstIndex, lastIndex;

    public NewDeque(int dequeLength) {
        deque = new int[dequeLength];
        size = firstIndex = lastIndex = 0;
    }

    protected void push_front(int x) {
        firstIndex = (firstIndex - 1 + deque.length) % deque.length;
        deque[firstIndex] = x;
        size++;
    }

    protected void push_back(int x) {
        deque[lastIndex] = x;
        lastIndex = (lastIndex + 1) % deque.length;
        size++;
    }

    protected int pop_front() {
        if (size == 0) {
            return -1;
        }
        int value = deque[firstIndex];
        firstIndex = (firstIndex + 1) % deque.length;
        size--;
        return value;
    }

    protected int pop_back() {
        if (size == 0) {
            return -1;
        }
        lastIndex = (lastIndex - 1 + deque.length) % deque.length;
        int value = deque[lastIndex];
        size--;
        return value;
    }

    protected int size() {
        return size;
    }

    protected int empty() {
        return size == 0 ? 1 : 0;
    }

    protected int front() {
        if (size == 0) {
            return -1;
        }
        return deque[firstIndex];
    }

    protected int back() {
        if (size == 0) {
            return -1;
        }
        return deque[(lastIndex - 1 + deque.length) % deque.length];
    }
}
