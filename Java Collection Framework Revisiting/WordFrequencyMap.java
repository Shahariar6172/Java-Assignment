import java.util.*;
public class WordFrequencyMap {
    public static void main(String[] args) {
        String text = "java is fun and java is powerful";
        String[] words = text.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
