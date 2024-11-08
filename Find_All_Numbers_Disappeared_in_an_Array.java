// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
// Example 1:
// Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
  
import java.util.ArrayList;
//import java.util.List;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
      
        // Step 1: Mark each number in the array by negating the value at its corresponding index
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // Get the index corresponding to nums[i]
            if (nums[index] > 0) {
                nums[index] = -nums[index]; // Mark it as negative to indicate presence
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1); // Converting 0-based index to 1-based number
            }
        }
        
        return result;
    }
}
