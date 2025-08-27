/*Given a string s, return the lexicographically smallest subsequence of s that contains all the distinct characters of s exactly once.
Example 1:
Input: s = "bcabc"
Output: "abc"
Example 2:
Input: s = "cbacdcbc"
Output: "acdb"

Constraints:
1 <= s.length <= 1000
s consists of lowercase English letters.
Note: This question is the same as 316: https://leetcode.com/problems/remove-duplicate-letters/
*/


class Solution {
    public String smallestSubsequence(String s) {
 int[] lastIndex = new int[26]; 
    boolean[] inStack = new boolean[26]; 
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
        lastIndex[s.charAt(i) - 'a'] = i;
    }
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        int idx = c - 'a';

        if (inStack[idx]) continue;
        while (!stack.isEmpty() && c < stack.peek() &&
               lastIndex[stack.peek() - 'a'] > i) {
            char removed = stack.pop();
            inStack[removed - 'a'] = false;
        }

        stack.push(c);
        inStack[idx] = true;
    }
    StringBuilder sb = new StringBuilder();
    for (char ch : stack) {
        sb.append(ch);
    }
    return sb.toString();
}

}
