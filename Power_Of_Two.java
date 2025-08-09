/*Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.
Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:
Input: n = 3
Output: false

Constraints:

-231 <= n <= 231 - 1
*/



class Solution {
    public boolean isPowerOfTwo(int n) {
         return n > 0 && (n & (n - 1)) == 0;
      //  If n is 4 (binary 0100), then n - 1 is 3 (binary 0011).
// If you perform a bitwise AND between 4 and 3, the result is 0000.
// Thus, for a power of 2, the bitwise AND of n and n - 1 is always 0, because n has a single bit set and n - 1 has all bits set to the right of that bit.
    }
}
