//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
//The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
   class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        // if(nums.length==0){
        //     return nums.length;
        // }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }//you can leave any thing behind at the place of remaining position of the nums arrray
        // for(int j=k+1;j<nums.length;j++){
        //     nums[j]=-1;
        // }
        return k;
    }
}
