//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
// Example 1:
// Input: x = 123
// Output: 321
  
class Solution {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }

        StringBuilder s = new StringBuilder();

        if (x > 0) {
            while (x > 0) {
                s.append(x % 10); 
                x = x / 10;    
            }
        } else {
            int n = -x;           
            while (n > 0) {
                s.append(n % 10);
                n = n / 10;
            }
            s.insert(0, "-");  
        }

        try {
            int ans = Integer.parseInt(s.toString());
            return ans;          // Return the result if no overflow occurs
        } catch (NumberFormatException e) {
            return 0;            // Return 0 if overflow happens
        }
    }
}

