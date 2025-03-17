/*You are given an integer array nums consisting of 2 * n integers.
You need to divide nums into n pairs such that:
Each element belongs to exactly one pair.
The elements present in a pair are equal.
Return true if nums can be divided into n pairs, otherwise return false.
Example 1:
Input: nums = [3,2,3,2,2,2]
Output: true
Explanation: 
There are 6 elements in nums, so they should be divided into 6 / 2 = 3 pairs.
If nums is divided into the pairs (2, 2), (3, 3), and (2, 2), it will satisfy all the conditions.
Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation: 
There is no way to divide nums into 4 / 2 = 2 pairs such that the pairs satisfy every condition.
*/


// class Solution {
//     public boolean divideArray(int[] nums) {
//         if(nums.length % 2 !=0){
//             return false;
//         }
//         HashMap<Integer,Integer>map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }
//        for (Map.Entry<Integer, Integer> mapEntry : map.entrySet()) {
//           if (mapEntry.getValue() % 2 != 0) {
//             return false; 
//           }
//        }
//           return true;
//     }
//  }

class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq = new int[501];
        for(int i = 0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i = 0; i<501; i++){
            if(freq[i]%2 != 0){
                return false;
            }
        }
        return true;
    }
}
