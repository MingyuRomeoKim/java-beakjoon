package src.problem.class1;

import java.io.*;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * https://www.acmicpc.net/problem/2884
 */
public class Problem2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String readLineString = reader.readLine();
        String[] readLineArray = readLineString.split(" ");
        int hour = Integer.parseInt(readLineArray[0]);
        int minute = Integer.parseInt(readLineArray[1]);

        LocalTime beforeTime = LocalTime.of(hour, minute);
        LocalTime afterTime = beforeTime.minus(45, ChronoUnit.MINUTES);

        String afterTimeString = String.valueOf(afterTime);
        String[] afterTimeArray = afterTimeString.split(":");

        String answerHour = afterTimeArray[0];
        String answerMinute = afterTimeArray[1];

        if (answerHour.startsWith("0")) {
            answerHour = answerHour.substring(1);
        }

        if (answerMinute.startsWith("0")) {
            answerMinute = answerMinute.substring(1);
        }


        writer.write(answerHour + " " + answerMinute);
        writer.flush();
        reader.close();
        writer.close();
    }
}