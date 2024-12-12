//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
// Example 1:
// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:
// Input: s = "axc", t = "ahbgdc"
// Output: false
 
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sIndex = 0, tIndex = 0;

        // Traverse both strings
        while (sIndex < s.length() && tIndex < t.length()) {
            // If characters match, move pointer in 's'
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            // Always move pointer in 't'
            tIndex++;
        }

        // If we've traversed the entire 's', it's a subsequence
        return sIndex == s.length();
    }
}
