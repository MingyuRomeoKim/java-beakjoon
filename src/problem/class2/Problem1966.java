package src.problem.class2;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Problem1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(reader.readLine());

        for (int i = 0; i < testCase; i++) {
            int[] readLineArray = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int documentCount = readLineArray[0];
            int targetIndex = readLineArray[1];
            int[] queueValues = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            Queue<Document> queue = new LinkedList<>();
            for (int j = 0; j < documentCount; j++) {
                queue.add(new Document(queueValues[j], j));
            }

            int answer = 0;
            while (!queue.isEmpty()) {
                Document current = queue.poll();
                if (queue.stream().anyMatch(document -> document.priority > current.priority)) {
                    queue.add(current);
                } else {
                    answer++;
                    if (current.index == targetIndex) {
                        break;
                    }
                }
            }

            writer.write(String.valueOf(answer));
            writer.write("\n");
        }
        writer.flush();
        reader.close();
        writer.close();
    }

    static class Document {
        int priority;
        int index;

        Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }
}

