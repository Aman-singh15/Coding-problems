/*You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.
Given an integer n, return the number of ways to tile an 2 x n board. Since the answer may be very large, return it modulo 109 + 7.
In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.
Example 1:
Input: n = 3
Output: 5
Explanation: The five different ways are show above.
Example 2:
Input: n = 1
Output: 1
Constraints:
1 <= n <= 1000
*/


class Solution {
    private static final int MOD = 1_000_000_007;
    public int numTilings(int n) {
        Long[] dp = new Long[n + 1];
        return (int) solve(n, dp);
    }
    private long solve(int n, Long[] dp) {
        if (n == 0) return 1;       // base case: empty board
        if (n == 1) return 1;       // one vertical domino
        if (n == 2) return 2;       // two vertical or two horizontal
        if (dp[n] != null) return dp[n];
        long res = solve(n - 1, dp) + solve(n - 2, dp); // standard domino tiling
        // Tromino contributions: from 3 to n
        for (int i = 3; i <= n; i++) {
            res = (res + 2 * solve(n - i, dp)) % MOD; // Tromino shapes
        }
        return dp[n] = res % MOD;
    }
}
