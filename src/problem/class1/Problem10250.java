package src.problem.class1;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/1157
 */
public class Problem10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();
        int loopCount = Integer.parseInt(readLineString);

        String[] inputStringArray = new String[loopCount];

        for (int i = 0; i < loopCount; i++) {
            inputStringArray[i] = reader.readLine();
        }

        printAnswer(inputStringArray, writer);

        writer.flush();
        reader.close();
        writer.close();
    }

    private static void printAnswer(String[] inputStringArray, BufferedWriter writer) throws IOException {
        String[] questionArray;
        int row, col, turn;
        int roomFloor, roomNumber;

        for (String item : inputStringArray) {
            questionArray = item.split(" ");
            row = Integer.parseInt(questionArray[0]); // 호텔의 층 수
            col = Integer.parseInt(questionArray[1]); // 각 층의 방 수
            turn = Integer.parseInt(questionArray[2]); // 몇 번째 손님인지

            roomFloor = (turn % row) == 0 ? row : (turn % row);
            roomNumber = (turn + row - 1) / row;

            String answerString = roomFloor + (roomNumber < 10 ? "0" : "") + roomNumber;
            writer.write(answerString);
            writer.write("\n");
        }
    }
}
