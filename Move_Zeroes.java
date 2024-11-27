//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.
// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

class Solution {
    public void moveZeroes(int[] nums) {
        //Approach 1:- Using Swap to the elements in order with non zero
    //   for(int i=0;i<nums.length-1;i++){
    //     if(nums[i]==0){
    //       for(int j=i+1;j<nums.length;j++){
    //         if(nums[j]!=0){
    //             int temp=nums[i];
    //             nums[i]=nums[j];
    //             nums[j]=temp;
    //             break;
    //         }
    //       }
    //     }
    //   }
      //Approach 2:- 
         int start=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[start]=nums[i];
                start++;
            }
         }
          for(int i=start;i<nums.length;i++){
                nums[i]=0; 
            }
         
    }
}
