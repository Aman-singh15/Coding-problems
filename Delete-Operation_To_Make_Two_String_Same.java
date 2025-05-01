/*
Given two strings word1 and word2, return the minimum number of steps required to make word1 and word2 the same.
In one step, you can delete exactly one character in either string
Example 1:
Input: word1 = "sea", word2 = "eat"
Output: 2
Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
Example 2:
Input: word1 = "leetcode", word2 = "etco"
Output: 4
Constraints:
1 <= word1.length, word2.length <= 500
word1 and word2 consist of only lowercase English letters.
*/


//  Approach 1:- Using hashmap but gives wrong answer for unordered frequent element
// class Solution {
//     public int minDistance(String word1, String word2) {
//       HashMap<Character,Integer>map = new HashMap<>();
//       for(int i=0;i<word1.length();i++){
//           map.put(word1.charAt(i),map.getOrDefault(word1.charAt(i),0)+1);
//       }
//       int count=0;
//       for (int i = 0; i < word2.length(); i++) {
//             char ch = word2.charAt(i);
//            if(map.containsKey(ch)){
//                 map.put(ch, map.getOrDefault(ch, 0) - 1);
//            }else{
//               map.put(ch, map.getOrDefault(ch, 0) + 1);
//            }
//       }
//      for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//         if (entry.getValue() > 0) {
//         count += entry.getValue();
//         }
//       }
//         return count;
//     }
// }
// Approach:- DP(LCS)
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        Integer[][] dp = new Integer[m][n];
        int lcsLen = lcs(word1, word2, m - 1, n - 1, dp);
        return m + n - 2 * lcsLen;
    }

    private int lcs(String s1, String s2, int i, int j, Integer[][] dp) {
        if (i < 0 || j < 0) return 0;
        if (dp[i][j] != null) return dp[i][j];

        if (s1.charAt(i) == s2.charAt(j)) {
            return dp[i][j] = 1 + lcs(s1, s2, i - 1, j - 1, dp);
        } else {
            int op1 = lcs(s1, s2, i - 1, j, dp);
            int op2 = lcs(s1, s2, i, j - 1, dp);
            return dp[i][j] = Math.max(op1, op2);
        }
    }
}
