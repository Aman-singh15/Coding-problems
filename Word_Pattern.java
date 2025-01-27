/*Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. Specifically:
Each letter in pattern maps to exactly one unique word in s.
Each unique word in s maps to exactly one letter in pattern.
No two letters map to the same word, and no two words map to the same letter.
Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Explanation:
The bijection can be established as:
'a' maps to "dog".
'b' maps to "cat".
Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false  */


import java.util.HashMap; 
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reversemap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = str[i];
            if (map.containsKey(c)) {
                String preword = map.get(c);
                map.put(c, word);
                if (!map.get(c).equals(preword)) {// this satisfies the condition that each letter must map to unique word
                    return false;
                }
            } else {
                if (reversemap.containsKey(word) && reversemap.get(word) != c) {// this condition satisfies this condition (Each unique word in s maps to exactly one letter in pattern).
                    return false;
                }
                map.put(c, word);
                reversemap.put(word, c);
            }
        }
        return true;
    }
}
