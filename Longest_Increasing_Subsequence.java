/*Given an integer array nums, return the length of the longest strictly increasing subsequence.
Example 1:
Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:
Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:
Input: nums = [7,7,7,7,7,7,7]
Output: 1
*/


class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        Integer[][] dp = new Integer[n][n + 1];
        return helper(0, -1, nums, dp);
    }
    private int helper(int curr, int prev, int[] nums, Integer[][] dp) {
        if (curr == nums.length) return 0;
        if (dp[curr][prev + 1] != null) return dp[curr][prev + 1];
        int notTake = helper(curr + 1, prev, nums, dp);
        int take = 0;
        if (prev == -1 || nums[curr] > nums[prev]) {
            take = 1 + helper(curr + 1, curr, nums, dp);
        }

        return dp[curr][prev + 1] = Math.max(take, notTake);
    }
}
