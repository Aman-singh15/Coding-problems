//Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindromethat can be built with those letters.
// Letters are case sensitive, for example, "Aa" is not considered a palindrome.
// Example 1:
// Input: s = "abccccdd"
// Output: 7
// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
// Example 2:
// Input: s = "a"
// Output: 1
// Explanation: The longest palindrome that can be built is "a", whose length is 1.
  
import java.util.HashMap;
public class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        int palindromeLength = 0;
        boolean hasOddFrequency = false;
        
        for (int count : charCount.values()) {
            if (count % 2 == 0) {
                palindromeLength += count;
            } else {
                palindromeLength += count - 1;
                hasOddFrequency = true;
            }
        }
        if (hasOddFrequency) {
            palindromeLength += 1;
        }
        
        return palindromeLength;
    }
}
