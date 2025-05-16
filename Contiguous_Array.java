/*Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
Example 1:
Input: nums = [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.
Example 2:
Input: nums = [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
Example 3:
Input: nums = [0,1,1,1,1,1,0,0,0]
Output: 6
Explanation: [1,1,1,0,0,0] is the longest contiguous subarray with equal number of 0 and 1.
*/



import java.util.*;
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> deltaMap = new HashMap<>();
        deltaMap.put(0, -1);  // Important base case
        int count0 = 0, count1 = 0, maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else {
                count1++;
            }
            int delta = count1 - count0;
            if (deltaMap.containsKey(delta)) {
                maxLen = Math.max(maxLen, i - deltaMap.get(delta));
            } else {
                deltaMap.put(delta, i);
            }
        }
        return maxLen;
    }
}
