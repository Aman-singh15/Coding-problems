/*You are given a string s consisting of lowercase English letters.
Your task is to find the maximum difference diff = freq(a1) - freq(a2) between the frequency of characters a1 and a2 in the string such that:
a1 has an odd frequency in the string.
a2 has an even frequency in the string.
Return this maximum difference.
Example 1:
Input: s = "aaaaabbc"
Output: 3
Explanation:
The character 'a' has an odd frequency of 5, and 'b' has an even frequency of 2.
The maximum difference is 5 - 2 = 3.
Example 2:
Input: s = "abcabcab"
Output: 1
Explanation:
The character 'a' has an odd frequency of 3, and 'c' has an even frequency of 2.
The maximum difference is 3 - 2 = 1.
*/



class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) { 
                for (int j = 0; j < 26; j++) {
                    if (freq[j] % 2 == 0 && freq[j] > 0) {
                        maxDiff = Math.max(maxDiff, freq[i] - freq[j]);
                    }
                }
            }
        }
        return maxDiff == Integer.MIN_VALUE ? -1 : maxDiff;
    }
}
