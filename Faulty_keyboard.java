/*Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.
You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
Return the final string that will be present on your laptop screen.
Example 1:
Input: s = "string"
Output: "rtsng"
Explanation: 
After typing first character, the text on the screen is "s".
After the second character, the text is "st". 
After the third character, the text is "str".
Since the fourth character is an 'i', the text gets reversed and becomes "rts".
After the fifth character, the text is "rtsn". 
After the sixth character, the text is "rtsng". 
Therefore, we return "rtsng".*/


// class Solution {
//     public String finalString(String s) {
//         String ans="";
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='i'){
//                 String str = ans;
//                 StringBuilder sb = new StringBuilder(str);
//                  ans = sb.reverse().toString();
//             }else{
//                 ans+=s.charAt(i);
//             }
//         }
//         return ans;
//     }
// }
// Approach 2:-
class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'i'){
                sb.reverse();
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
