/*Given an integer n, return the nth digit of the infinite integer sequence [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...].
Example 1:
Input: n = 3
Output: 3
Example 2:
Input: n = 11
Output: 0
Explanation: The 11th digit of the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... is a 0, which is part of the number 10.
*/


class Solution {
    public int findNthDigit(int n) {
        int digitLength = 1;
        long count = 9;
        int start = 1;
        
        // Step 1: Find the digit length of the number containing the nth digit
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }
        
        // Step 2: Find the actual number containing the nth digit
        int number = start + (n - 1) / digitLength;
        
        // Step 3: Extract the nth digit from the number
        String numStr = Integer.toString(number);
        return numStr.charAt((n - 1) % digitLength) - '0';
    
    }
}
