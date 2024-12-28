//You are given a 0-indexed integer array nums having length n, an integer indexDifference, and an integer valueDifference.
// Your task is to find two indices i and j, both in the range [0, n - 1], that satisfy the following conditions:
// abs(i - j) >= indexDifference, and
// abs(nums[i] - nums[j]) >= valueDifference
// Return an integer array answer, where answer = [i, j] if there are two such indices, and answer = [-1, -1] otherwise. If there are multiple choices for the two indices, return any of them.
// Note: i and j may be equal.
// Example 1:
// Input: nums = [5,1,4,1], indexDifference = 2, valueDifference = 4
// Output: [0,3]
// Explanation: In this example, i = 0 and j = 3 can be selected.
// abs(0 - 3) >= 2 and abs(nums[0] - nums[3]) >= 4.
// Hence, a valid answer is [0,3].
// [3,0] is also a valid answer.

class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
      int ans[]=new int[2];
      int k=0;
        for(int i=0;i<nums.length;i++){
          for(int j=0;j<nums.length;j++){
                 if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j])>=valueDifference){
                     ans[0]=i;
                     ans[1]=j;
                     return ans;
                 }
          }
        }
                ans[0]=-1;
                ans[1]=-1;
                return ans;
    } 
}

