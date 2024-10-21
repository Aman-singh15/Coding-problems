// Write an algorithm to determine if a number n is happy.
  
// A happy number is a number defined by the following process:
// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

class Solution {
    private static int find(int n){
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans += rem * rem;
            n = n / 10;
        }
        return ans;
    }

    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {  // If n becomes 1, it's a happy number and if n becomes 4 it create a cycle so we have to stop at we get 4
            n = find(n);
        }
        return n == 1;
    }
}
