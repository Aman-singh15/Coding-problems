/*Given an integer n, return the count of all numbers with unique digits, x, where 0 <= x < 10n.
Example 1:
Input: n = 2
Output: 91
Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100, excluding 11,22,33,44,55,66,77,88,99
Example 2:
Input: n = 0
Output: 1 */

class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        if (n == 1) return 10;

        int count = 10, product = 9, availableDigits = 9;
        for (int i = 2; i <= n; i++) {
            product *= availableDigits;
            count += product;  // 9×9, 9×9×8, 9×9×8×7... this will follow Multiply unique by decreasing produc 
            availableDigits--;  // Sum of unique numbers for each digit length
        }
        return count;  
    }
}
