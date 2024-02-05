package src.problem.class2;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Problem1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int loopCount = Integer.parseInt(reader.readLine());

        ArrayList<String> stringArrayList = new ArrayList<>();

        for (int i = 0; i < loopCount; i++) {
            stringArrayList.add(reader.readLine());
        }

        Map<String,Integer> sortedItemsMap = sortBySolution(stringArrayList);

        sortedItemsMap.entrySet().forEach(item -> {
            try {
                writer.write(String.valueOf(item.getKey()));
                writer.write("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        writer.flush();
        reader.close();
        writer.close();
    }
    private static Map<String,Integer> sortBySolution(ArrayList<String> items) {
        Map<String, Integer> hashMap = new HashMap<>();

        int length;
        for (String item : items) {
            length = item.length();
            if (!hashMap.containsKey(item)) {
                hashMap.put(item, length);
            }
        }

        return hashMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().
                        thenComparing(Map.Entry.comparingByKey())
                )
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }
}
