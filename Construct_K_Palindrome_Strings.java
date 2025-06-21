// Given a string s and an integer k, return true if you can use all the characters in s to construct non-empty k palindrome strings or false otherwis
// Example 1:
// Input: s = "annabelle", k = 2
// Output: true
// Explanation: You can construct two palindromes using all characters in s.
// Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"
// Example 2:
// Input: s = "leetcode", k = 3
// Output: false
// Explanation: It is impossible to construct 3 palindromes using all the characters of s.
// Example 3:
// Input: s = "true", k = 4
// Output: true
// Explanation: The only possible solution is to put each character in a separate string.
// Constraints:
// 1 <= s.length <= 105
// s consists of lowercase English letters.
// 1 <= k <= 105

import java.util.*;
class Solution {
    public boolean canConstruct(String s, int k) {
        if (k > s.length()) return false;
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 != 0) oddCount++;
        }
        return oddCount <= k;
    }
}
