/*An additive number is a string whose digits can form an additive sequence.
A valid additive sequence should contain at least three numbers. Except for the first two numbers, each subsequent number in the sequence must be the sum of the preceding two.
Given a string containing only digits, return true if it is an additive number or false otherwise.
Note: Numbers in the additive sequence cannot have leading zeros, so sequence 1, 2, 03 or 1, 02, 3 is invalid.
Example 1:
Input: "112358"
Output: true
Explanation: 
The digits can form an additive sequence: 1, 1, 2, 3, 5, 8. 
1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
Example 2:
Input: "199100199"
Output: true
Explanation: 
The additive sequence is: 1, 99, 100, 199. 
1 + 99 = 100, 99 + 100 = 199  */
 
class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
                if (isValid(i, j, num)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isValid(int i, int j, String num) {
        String num1 = num.substring(0, i);
        String num2 = num.substring(i, i + j);
        if ((num1.length() > 1 && num1.startsWith("0")) || (num2.length() > 1 && num2.startsWith("0"))) {
            return false;
        }

        long first = Long.parseLong(num1);
        long second = Long.parseLong(num2);

        StringBuilder sb = new StringBuilder(num1).append(num2);
        while (sb.length() < num.length()) {
            long sum = first + second;
            sb.append(sum);
            first = second;
            second = sum;
        }

        return sb.toString().equals(num);
    }
}
