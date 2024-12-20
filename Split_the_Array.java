// You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:
// nums1.length == nums2.length == nums.length / 2.
// nums1 should contain distinct elements.
// nums2 should also contain distinct elements.
// Return true if it is possible to split the array, and false otherwise.
// Example 1:
// Input: nums = [1,1,2,2,3,4]
// Output: true
// Explanation: One of the possible ways to split nums is nums1 = [1,2,3] and nums2 = [1,2,4].


import java.util.HashMap;
class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer>Map = new HashMap<>();
        
        // Count the frequency of each number in nums
       for(int i=0;i<nums.length;i++){
            if(Map.containsKey(nums[i])){
                Map.put(nums[i],Map.get(nums[i])+1);
            }else{
                Map.put(nums[i],1);
            }
       }
        // Check if any number appears more than twice
        for (int count : Map.values()) {
            if (count > 2) {
                return false; // Impossible to split with distinct elements
            }
        }
        // for(int i=0;i<nums.length;i++){
        //     if(Map.get(nums[i])>2){
        //         return false;
        //     }
        // }
        
        return true;
    }
}
