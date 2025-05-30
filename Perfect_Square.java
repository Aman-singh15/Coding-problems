/*Given an integer n, return the least number of perfect square numbers that sum to n.
A perfect square is an integer that is the square of an integer; in other words, it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares while 3 and 11 are not.
Example 1:
Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4.
Example 2:
Input: n = 13
Output: 2*/
  
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        //no numbers needed to form 0).
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            // Initialize dp[i] to a large value (to find the minimum).
            dp[i] = Integer.MAX_VALUE;

            // Loop through all perfect squares less than or equal to i.
            for (int j = 1; j * j <= i; j++) {
                // The state transition: dp[i] = min(dp[i], dp[i - j*j] + 1)
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }

        return dp[n];
    }
}
