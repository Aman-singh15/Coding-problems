/*Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
Example 1:
Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.
Example 2:
Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.
Example 3:
Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.
Constraints:
1 <= s.length, goal.length <= 2 * 104
s and goal consist of lowercase letters.
*/




import java.util.*;
class Solution {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        Set<Integer> seenRemainders = new HashSet<>();
        int num = 0;
        for (int length = 1; length <= k; length++) {
            num = (num * 10 + 1) % k;
            if (num == 0) return length;
            if (seenRemainders.contains(num)) return -1; // Cycle detected
            seenRemainders.add(num);
        }
        return -1;
    }
}
