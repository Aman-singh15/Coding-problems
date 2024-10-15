// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
   import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int majorityElement = nums[0];
        int maxCount = 0;

        // Step 1: Iterate through the array and populate the HashMap
        for (int num : nums) {
            // Increment the count for the current number
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

            // Step 2: Track the element with the highest frequency
            if (frequencyMap.get(num) > maxCount) {
                maxCount = frequencyMap.get(num);
                majorityElement = num;  // Update the majority element
            }
        }

        // Step 3: Return the element with the highest frequency
        return majorityElement;
    }
}
 
