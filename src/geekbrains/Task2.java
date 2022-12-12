package geekbrains;

import java.util.HashMap;

public class Task2 {
    public int countWords(String[] words1, String[] words2) {
        if (words1.length > words2.length) {
            return countWords(words2, words1);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            if (map.containsKey(word)) {
                if (map.get(word) <= 1) {
                    map.put(word, map.get(word) - 1);
                }
            }
        }

        int ans = 0;

        for (String word : words1) {
            if (map.get(word) == 0) {
                ans += 1;
            }
        }
        return ans;
    }
}

