//Given a binary array nums, return the maximum number of consecutive 1's in the array.
// Example 1:
// Input: nums = [1,1,0,1,1,1]
// Output: 3

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
              if(nums[i]!=1){
                ans.add(count);
                count=0;
              }else{
                count++;
              }
        }
        ans.add(count);
        int max=-1;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)>max){
                max=ans.get(i);
            }
        }
        return max;
    }
}
