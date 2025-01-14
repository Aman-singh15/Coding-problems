/*Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
Example 1:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]
Example 2:
Input: s = "a"
Output: [["a"]]*/


import java.util.*;
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        backtrack(s, 0, list, ans);
        return ans;
    }

    private void backtrack(String s, int start, List<String> list, List<List<String>> ans) {
        // Base case: If we have reached the end of the string, add the current partition to the result
        if (start == s.length()) {
            ans.add(new ArrayList<>(list));
            return;
        }

        // Explore all possible substrings starting from 'start'
        for (int i = start; i < s.length(); i++) {
            // Check if the substring is a palindrome
            if (isPalindrome(s, start, i)) {
                list.add(s.substring(start, i + 1));
                backtrack(s, i + 1, list, ans);

                // Backtrack by removing the last added substring
                list.remove(list.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
