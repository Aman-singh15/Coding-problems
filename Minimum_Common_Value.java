/*Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
Example 1:
Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.*/

//Approach 1:- Using HashMap
// import java.util.*;
// class Solution {
//     public int getCommon(int[] nums1, int[] nums2) {
//         HashMap<Integer,Integer>map=new HashMap<>();
//         for(int i=0;i<nums1.length;i++){
//             map.put(nums1[i],0);
//         }
//         for(int i=0;i<nums2.length;i++){
//             if(map.containsKey(nums2[i])){
//                 map.put(nums2[i],map.get(nums2[i])+1);
//             }
//         }
//         int count=Integer.MAX_VALUE;
//         int ans=-1;
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             int key=entry.getKey();
//             int value=entry.getValue();
//             if(value!=0 && key<count){
//                 count=key;
//                 ans=key;
//             }
//         }
//              return ans;
//     }
// }
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0; // Pointers for nums1 and nums2
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i]; // Found the smallest common element
            } else if (nums1[i] < nums2[j]) {
                i++; 
            } else {
                j++;
            }
        }
        return -1;
    }
}
