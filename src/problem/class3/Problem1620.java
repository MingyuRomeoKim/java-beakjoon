package src.problem.class3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Problem1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputArray = reader.readLine().split(" ");
        int pokemonCount = Integer.parseInt(inputArray[0]);
        int questionCount = Integer.parseInt(inputArray[1]);

        // 포켓몬 이름과 번호를 저장할 HashMap
        Map<String, Integer> nameToNumberMap = new HashMap<>();
        String[] numberToNameMap = new String[pokemonCount];

        for (int i = 0; i < pokemonCount; i++) {
            String pokemonName = reader.readLine();
            nameToNumberMap.put(pokemonName, i + 1);
            numberToNameMap[i] = pokemonName;
        }

        for (int i = 0; i < questionCount; i++) {
            String question = reader.readLine();
            String answer = "";
            try {
                int questionNumber = Integer.parseInt(question);
                answer = numberToNameMap[questionNumber - 1];
            } catch (NumberFormatException exception) {
                answer = String.valueOf(nameToNumberMap.get(question));
            }

            writer.write(answer + "\n");
        }

        writer.flush();
        reader.close();
        writer.close();
    }
}