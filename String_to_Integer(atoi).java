/*Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
The algorithm for myAtoi(string s) is as follows:
Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
Return the integer as the final result.
Example 1:
Input: s = "42"
Output: 42
Explanation:
The underlined characters are what is read in and the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)       ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')       ^
Step 3: "42" ("42" is read in)
  ^
Example 2:
Input: s = " -042"
Output: -428*/
  
class Solution {
    public int myAtoi(String s) {
        char[] ch = s.toCharArray();
        String ans = "";
        int i = 0;

        // Skip leading spaces
        while (i < s.length() && ch[i] == ' ') {
            i++;
        }

        // Handle optional '+' or '-' sign by adding them into our ans string
        if (i < s.length() && (ch[i] == '+' || ch[i] == '-')) {
            ans += ch[i];  // Append the sign
            i++;
        }

        //if digit is present then adding it in our ans string
        while (i < s.length() && Character.isDigit(ch[i])) {
            ans += ch[i]; // Append the digit
            i++;
        }

        // If no digits were found, return 0
        if (ans.isEmpty() || (ans.equals("-") || ans.equals("+"))) {
            return 0;
        }

        // Convert the result string to an integer and handle overflow
        try {
            return Integer.parseInt(ans);
        } catch (NumberFormatException e) {
            // Handle overflow: return Integer.MIN_VALUE or Integer.MAX_VALUE
            return ans.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}

