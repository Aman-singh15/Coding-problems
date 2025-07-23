/*You are given a string s and two integers x and y. You can perform two types of operations any number of times.
Remove substring "ab" and gain x points.
For example, when removing "ab" from "cabxbae" it becomes "cxbae".
Remove substring "ba" and gain y points.
For example, when removing "ba" from "cabxbae" it becomes "cabxe".
Return the maximum points you can gain after applying the above operations on s.
Example 1:
Input: s = "cdbcbbaaabab", x = 4, y = 5
Output: 19
Explanation:
- Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
- Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
- Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
- Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
Total score = 5 + 4 + 5 + 5 = 19.
Example 2:
Input: s = "aabbaaxybbaabb", x = 5, y = 4
Output: 20
*/


class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return removePattern(s, 'a', 'b', x, y);
        } else {
            return removePattern(s, 'b', 'a', y, x);
        }
    }
    private int removePattern(String s, char first, char second, int firstGain, int secondGain) {
        int total = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = sb.length();
            if (len > 0 && sb.charAt(len - 1) == first && c == second) {
                sb.deleteCharAt(len - 1);
                total += firstGain;
            } else {
                sb.append(c);
            }
        }
        StringBuilder finalStr = new StringBuilder();
        for (char c : sb.toString().toCharArray()) {
            int len = finalStr.length();
            if (len > 0 && finalStr.charAt(len - 1) == second && c == first) {
                finalStr.deleteCharAt(len - 1);
                total += secondGain;
            } else {
                finalStr.append(c);
            }
        }
        return total;
    }
}
