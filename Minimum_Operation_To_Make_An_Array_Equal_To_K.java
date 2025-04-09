/*ou are given an integer array nums and an integer k.
An integer h is called valid if all values in the array that are strictly greater than h are identical.
For example, if nums = [10, 8, 10, 8], a valid integer is h = 9 because all nums[i] > 9 are equal to 10, but 5 is not a valid integer.
You are allowed to perform the following operation on nums:
Select an integer h that is valid for the current values in nums.
For each index i where nums[i] > h, set nums[i] to h.
Return the minimum number of operations required to make every element in nums equal to k. If it is impossible to make all elements equal to k, return -1.
Example 1:
Input: nums = [5,2,5,4,5], k = 2
Output: 2
Explanation:
The operations can be performed in order using valid integers 4 and then 2.
Example 2:
Input: nums = [2,1,2], k = 2
Output: -1
Explanation:
It is impossible to make all the values equal to 2.
Example 3:
Input: nums = [9,7,5,3], k = 1
Output: 4
Explanation:
The operations can be performed using valid integers in the order 7, 5, 3, and 1.

Constraints:

1 <= nums.length <= 100 
1 <= nums[i] <= 100
1 <= k <= 100
*/


// class Solution {
//     public int minOperations(int[] nums, int k) {
//         Arrays.sort(nums);
//         int[]arr = new int[nums.length];
//         for (int i = 0; i < nums.length; i++) {
//          arr[i] = nums[nums.length - 1 - i];
//         }
//         int t=arr.length-1;
//         int count=0;
//         while (!allK(arr, k) && t >= 0){
//             int val=arr[t];
//             boolean changed = false;
//             if(isvalid(arr,val)){
//                for(int i=0;i<arr.length;i++){
//                   if(arr[i]!=k && arr[i]>val){
//                       arr[i]=val;
//                       changed=true;
//                   }
//                }
//                 if (changed) {
//                     count++;
//                     t = arr.length - 1; // reset because array changed
//                 } else {
//                     t--;
//                 }
//             }else{
//                 t--;
//             }
//         }
//         return allK(arr, k) ? count : -1;
//     }
//     public boolean isvalid(int[]arr,int val){
//       HashMap<Integer,Integer>map = new HashMap<>();
//       for(int i=0;i<arr.length;i++){
//          if(arr[i]>val){
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
//          }
//       }
//         return map.size()==1;
      
//     }
//     public boolean allK(int[]arr,int k){
//        for(int checkval:arr){
//          if(checkval!=k){
//             return false;
//          }
//        }
//        return true;
//     }
// }

// class Solution {
//     public int minOperations(int[] nums, int k) {
//         Set<Integer> unique = new HashSet<>();
//         for (int num : nums) {
//             if (num > k) unique.add(num);
//         }
//          boolean allK = true;
//         for (int num : nums) {
//             if (num != k) {
//                 allK = false;
//                 break;
//             }
//         }

//         if (allK) return 0;
        
//         if(unique.size()==0){
//           return -1;
//         }
//         return unique.size();
//     }
// }

class Solution {
    public int minOperations(int[] nums, int k) {
        // Check for invalid case
        for (int num : nums) {
            if (num < k) return -1;
        }

        Set<Integer> greaterThanK = new HashSet<>();
        for (int num : nums) {
            if (num > k) greaterThanK.add(num);
        }

        return greaterThanK.size();
    }
}
