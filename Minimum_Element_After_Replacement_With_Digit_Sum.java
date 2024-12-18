/*You are given an integer array nums.
You replace each element in nums with the sum of its digits.
Return the minimum element in nums after all replacements.
Example 1:
Input: nums = [10,12,13,14]
Output: 1
Explanation:
nums becomes [1, 3, 4, 5] after all replacements, with minimum element 1*/
  
class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
           String indexAsString = Integer.toString(nums[i]);
          int sum=0;
          int j=0;
          while(j<indexAsString.length()){
             //  sum+= Character.getNumericValue(indexAsString.charAt(j));
               sum=sum+indexAsString.charAt(j)-'0';
               j++;
          }
             nums[i]=sum;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
             if(nums[i]<min){
                min=nums[i];
             }
        }
        return min;
    }
}
