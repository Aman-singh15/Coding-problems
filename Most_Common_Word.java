/*Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.
The words in paragraph are case-insensitive and the answer should be returned in lowercase. 
Example 1:
Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"*/
import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < paragraph.length(); i++) {
            char c = paragraph.charAt(i);

            // Check for delimiters or non-alphabetic characters
            if (!Character.isLetter(c)) {
                if (word.length() > 0) {
                    list.add(word.toString().toLowerCase());
                    word = new StringBuilder(); // Reset the word
                }
            } else {
                word.append(c);
            }
        }

        // Add the last word if there is any
        if (word.length() > 0) {
            list.add(word.toString().toLowerCase());
        }

        // Count the frequency of each word
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // Find the most common non-banned word
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String currentWord = entry.getKey();
            int count = entry.getValue();

            // Check if the word is not banned and has the highest frequency
            if (count > maxValue && !containsWord(banned, currentWord)) {
                maxValue = count;
                maxKey = currentWord;
            }
        }

        return maxKey; 
    }

    // Check if a word is in the banned list
    public boolean containsWord(String[] array, String word) {// Normalize both the banned list and the word to lowercase before comparison.
        for (String bannedWord : array) {
            if (bannedWord.toLowerCase().equals(word)) {
                return true;
            }
        }
        return false;
    }
}

