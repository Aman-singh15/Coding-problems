//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.HashMap;
//import java.util.Arrays;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i],1);
            }
        }
        return false;
        //2nd Approach
        // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        
        // }
        // return false;
    }
}
