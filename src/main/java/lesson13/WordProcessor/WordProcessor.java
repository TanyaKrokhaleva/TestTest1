package lesson13.WordProcessor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordProcessor {
    private final String[] words;

    public WordProcessor(String[] words) {
        this.words = words;
    }
    public Set<String> getUniqueWords() {
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        return uniqueWords;
    }
    public Map<String, Integer> getWordCounts() {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            }
        }
        return wordCount;
    }
}



