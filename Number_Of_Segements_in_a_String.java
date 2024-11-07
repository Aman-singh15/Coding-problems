//Given a string s, return the number of segments in the string.
// A segment is defined to be a contiguous sequence of non-space characters.
// Example 1:
// Input: s = "Hello, my name is John"
// Output: 5
// Explanation: The five segments are ["Hello,", "my", "name", "is", "John"

class Solution {
    public int countSegments(String s) {
        if(s.length()==0){
            return 0;
        }
        int n=s.length()-1;
        int count=0;
        // while(n>=0){
        for(int i=n;i>=0;i--){
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                count++;
            }
        }
        return count;
    }
}
