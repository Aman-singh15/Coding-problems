//Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.
// Example 1:
// Input: words = ["bella","label","roller"]
// Output: ["e","l","l"]

import java.util.*;
class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : words[0].toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int j = 1; j < words.length; j++) {
            HashMap<Character, Integer> tempMap = new HashMap<>();
            for (char c : words[j].toCharArray()) {
                if (map.containsKey(c)) {
                    tempMap.put(c, tempMap.getOrDefault(c, 0) + 1);
                }
            }
            for (char c : map.keySet()) {
                if (tempMap.containsKey(c)) {
                    map.put(c, Math.min(map.get(c), tempMap.get(c)));
                } else {
                    map.put(c, 0); // Character not in the current word
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            while (value > 0) {
                list.add(key.toString());
                value--;
            }
        }

        return list;
    }
}
