/*Given an array arr of non-negative integers and an integer target, the task is to count all subsets of the array whose sum is equal to the given target.
Examples:
Input: arr[] = [5, 2, 3, 10, 6, 8], target = 10
Output: 3
Explanation: The subsets {5, 2, 3}, {2, 8}, and {10} sum up to the target 10.
Input: arr[] = [2, 5, 1, 4, 3], target = 10
Output: 3
Explanation: The subsets {2, 1, 4, 3}, {5, 1, 4}, and {2, 5, 3} sum up to the target 10.
Input: arr[] = [5, 7, 8], target = 3
Output: 0
Explanation: There are no subsets of the array that sum up to the target 3.
Input: arr[] = [35, 2, 8, 22], target = 0
Output: 1
Explanation: The empty subset is the only subset with a sum of 0.
Constraints:
1 ≤ arr.size() ≤ 103
0 ≤ arr[i] ≤ 103
0 ≤ target ≤ 103
*/


class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
      //  if (target == 0) return 1;
        Integer[][] storage = new Integer[nums.length][target + 1];
        return isSum(storage, nums, nums.length - 1, target);
    }

    public int isSum(Integer[][] storage, int[] nums, int index, int target) {
        //if (target == 0) return 1;
        if (index < 0) return (target == 0) ? 1 : 0;
        if (storage[index][target] != null) return storage[index][target];

        int notpick = isSum(storage, nums, index - 1, target);
        int pick = 0;
        if (nums[index] <= target) { // FIXED THIS LINE
            pick = isSum(storage, nums, index - 1, target - nums[index]);
        }

        return storage[index][target] = pick + notpick;
    }
}
