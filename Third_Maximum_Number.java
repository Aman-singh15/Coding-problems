//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
 
import java.util.Arrays;
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=1;
        for(int i=n-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i-1];
            }
        }
        return nums[n-1];
        //Approach:- 2
//         if(nums.length<3){
//             return nums[nums.length-1];
//         }
//         int count=nums.length-1;
//         int max=1;
//         while(max<3 && count>0){
//             if( nums[count]>nums[count-1]){
//                 max++;
//             }
//             count--;
//         }
//         if(max==3){
//             // if(nums[count]<nums[count+1]){
//                 return nums[count];
//           //}
//        }
//         return nums[nums.length-1];
        
    }
}

