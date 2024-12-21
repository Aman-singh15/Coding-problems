// You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:
// answer1 : the number of indices i such that nums1[i] exists in nums2.
// answer2 : the number of indices i such that nums2[i] exists in nums1.
// Return [answer1,answer2].
//   Example 1:
// Input: nums1 = [4,3,2,3,1], nums2 = [2,2,5,2,3,6]
// Output: [3,4]
// Explanation:
// The elements at indices 1, 2, and 3 in nums1 exist in nums2 as well. So answer1 is 3.
// The elements at indices 0, 1, 3, and 4 in nums2 exist in nums1. So answer2 is 4.

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int ans[]=new int[2];
        int count=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    count++;
                    break;
                }
            }
        }
        ans[0]=count;
        count=0;
         for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    count++;
                    break;
                }
            }
         }
            ans[1]=count;
            return ans;
    }
}
