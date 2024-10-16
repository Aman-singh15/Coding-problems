// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

import java.util.HashMap;
public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max=0;
        int maxkey=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>max){
                max=map.get(nums[i]);
                maxkey=nums[i];
            }
        }
        return maxkey;
    }
}
 
