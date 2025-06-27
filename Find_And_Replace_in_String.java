/*You are given a 0-indexed string s that you must perform k replacement operations on. The replacement operations are given as three 0-indexed parallel arrays, indices, sources, and targets, all of length k.
To complete the ith replacement operation:
Check if the substring sources[i] occurs at index indices[i] in the original string s.
If it does not occur, do nothing.
Otherwise if it does occur, replace that substring with targets[i].
For example, if s = "abcd", indices[i] = 0, sources[i] = "ab", and targets[i] = "eee", then the result of this replacement will be "eeecd".
All replacement operations must occur simultaneously, meaning the replacement operations should not affect the indexing of each other. The testcases will be generated such that the replacements will not overlap.
For example, a testcase with s = "abc", indices = [0, 1], and sources = ["ab","bc"] will not be generated because the "ab" and "bc" replacements overlap.
Return the resulting string after performing all replacement operations on s.
A substring is a contiguous sequence of characters in a string.
Example 1:
Input: s = "abcd", indices = [0, 2], sources = ["a", "cd"], targets = ["eee", "ffff"]
Output: "eeebffff"
Explanation:
"a" occurs at index 0 in s, so we replace it with "eee".
"cd" occurs at index 2 in s, so we replace it with "ffff".
*/



import java.util.*;
class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length();
        Map<Integer, Integer> replaceMap = new HashMap<>();
      
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            String src = sources[i];
            if (s.startsWith(src, idx)) {
                replaceMap.put(idx, i); 
            }
        }
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < n) {
            if (replaceMap.containsKey(i)) {
                int repIndex = replaceMap.get(i);
                result.append(targets[repIndex]);
                i += sources[repIndex].length(); 
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }
        return result.toString();
    }
}
