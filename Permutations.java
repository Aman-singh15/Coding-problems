/*Given an array nums of distinct integers, return all the possible 
permutations
. You can return the answer in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]
Example 3:
Input: nums = [1]
Output: [[1]]*/


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generatePermutations(nums, 0, ans);
        return ans;
    }

    private void generatePermutations(int[] nums, int index, List<List<Integer>> ans) {
        if (index == nums.length) {// when it reach end of array so no more sequence to swap so add it in answer
            List<Integer> currentPermutation = new ArrayList<>();
            for (int i=0;i<nums.length;i++) {
                currentPermutation.add(nums[i]);
            }
            ans.add(currentPermutation);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, i, index);
            generatePermutations(nums, index + 1, ans); // Recursion
            swap(nums, i, index); // Backtrack
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
