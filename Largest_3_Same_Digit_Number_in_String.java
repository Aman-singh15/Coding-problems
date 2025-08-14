/*You are given a string num representing a large integer. An integer is good if it meets the following conditions:
It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.
Note:
A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.
Example 1:
Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".
Example 2:
Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.
Example 3:
Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
 

Constraints:

3 <= num.length <= 1000
num only consists of digits.
*/


// class Solution {
//     public String largestGoodInteger(String num) {
//         StringBuilder str = new StringBuilder();
//         int max=-1;
//         for(int i=0;i<num.length()-2;i++){
//                  if(num.charAt(i)-'0'== num.charAt(i+1)-'0' && num.charAt(i)-'0'== num.charAt(i+2)-'0'){
//                     int val = num.charAt(i) - '0';
//                     max = Math.max(max,val);
//                  }
//         }
//         if(max==-1){
//           return "";
//         }
//         int k=3;
//         while(k>0){
//             str.append(max);
//             k--;
//         }
//         return str.toString();
//     }
// }



class Solution {
    public String largestGoodInteger(String num) {
        StringBuilder str = new StringBuilder();
        int max = -1;

        for (int i = 0; i < num.length() - 2; i++) {
            int count = 1;
            for (int j = i + 1; j < num.length(); j++) {
                if (num.charAt(i) == num.charAt(j)) {
                    count++;
                } else {
                    break;
                }

                if (count == 3) {
                    int val = num.charAt(i) - '0';
                    max = Math.max(max, val);
                    break;
                }
            }
        }
        if (max == -1) return "";

        for (int k = 0; k < 3; k++) {
            str.append(max);
        }

        return str.toString();
    }
}
