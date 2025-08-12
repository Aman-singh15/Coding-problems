
/*Given two positive integers n and x.
Return the number of ways n can be expressed as the sum of the xth power of unique positive integers, in other words, the number of sets of unique integers [n1, n2, ..., nk] where n = n1x + n2x + ... + nkx.
Since the result can be very large, return it modulo 109 + 7.
For example, if n = 160 and x = 3, one way to express n is n = 23 + 33 + 53.
Example 1:
Input: n = 10, x = 2
Output: 1
Explanation: We can express n as the following: n = 32 + 12 = 10.
It can be shown that it is the only way to express 10 as the sum of the 2nd power of unique integers.
Example 2:
Input: n = 4, x = 1
Output: 2
Explanation: We can express n in the following ways:
- n = 41 = 4.
- n = 31 + 11 = 4.
Constraints:
1 <= n <= 300
1 <= x <= 5
*/



class Solution {
    static final int MOD = 1_000_000_007;
    public int numberOfWays(int n, int x) {
        List<Integer> powers = new ArrayList<>();
        for (int i = 1; Math.pow(i, x) <= n; i++) {
            powers.add((int)Math.pow(i, x));
        }
        Integer[][] dp = new Integer[powers.size()][n + 1];
        return dfs(0, n, powers, dp);
    }
    private int dfs(int idx, int remaining, List<Integer> powers, Integer[][] dp) {
        if (remaining == 0) return 1;  // Found valid way
        if (idx >= powers.size() || remaining < 0) return 0;
        if (dp[idx][remaining] != null) return dp[idx][remaining];
        int take = dfs(idx + 1, remaining - powers.get(idx), powers, dp);
        int skip = dfs(idx + 1, remaining, powers, dp);
        
        return dp[idx][remaining] = (int)(((long)take + skip) % MOD);
    }
}
