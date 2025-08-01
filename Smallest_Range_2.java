/*You are given an integer array nums and an integer k.
For each index i where 0 <= i < nums.length, change nums[i] to be either nums[i] + k or nums[i] - k.
The score of nums is the difference between the maximum and minimum elements in nums.
Return the minimum score of nums after changing the values at each index.
Example 1:
Input: nums = [1], k = 0
Output: 0
Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
Example 2:
Input: nums = [0,10], k = 2
Output: 6
Explanation: Change nums to be [2, 8]. The score is max(nums) - min(nums) = 8 - 2 = 6.
*/



  import java.util.*;
class Solution {
    public  int smallestRangeII(int[] nums, int k) {
     Arrays.sort(nums);
        int n = nums.length;
        int result = nums[n - 1] - nums[0];

        for (int i = 0; i < n - 1; i++) {
            int high = Math.max(nums[n - 1] - k, nums[i] + k);
            int low = Math.min(nums[0] + k, nums[i + 1] - k);
            result = Math.min(result, high - low);
        }
        return result;
    }
}
