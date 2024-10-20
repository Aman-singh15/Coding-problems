// An array is monotonic if it is either monotone increasing or monotone decreasing.
// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 
class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length==1 || nums.length==2){
            return true;
        }
        int k=0;
        int j=0;
        while(j < nums.length - 1 &&nums[j]==nums[j+1]){
            k++;
            j++;
            
        }
        // handle decreasing case
        if(k < nums.length - 1 && nums[k]>nums[k+1]){
         for(int i=0;i<nums.length-1;i++){
             if(nums[i]>=nums[i+1]){

             }else{
                return false;
             }
            }
            if(nums[nums.length-2]>=nums[nums.length-1]){
                return true;
            }
        }
        // handling increasing case
        if(k < nums.length - 1 && nums[k]<nums[k+1]){
         for(int i=0;i<nums.length-1;i++){
             if(nums[i]<=nums[i+1]){

             }else{
                return false;
             }
            }
            if(nums[nums.length-2]<=nums[nums.length-1]){
                return true;
            }
        }
        return true;// if all elements are equal return true
        
        
    }
}
