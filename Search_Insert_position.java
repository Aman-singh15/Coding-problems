//Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
   class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }
        } 
         return start; // Target not found, start gives the insertion index
        // int i;
        // for( i=0;i<nums.length;i++){
        //     if(nums[i]>target){
        //         break;
        //     }
        // }
           //  return i;     
    }
}

 
