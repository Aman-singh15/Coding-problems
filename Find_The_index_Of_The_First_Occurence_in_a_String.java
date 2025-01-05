/*Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.*/
 
class Solution {
    public int strStr(String haystack, String needle) {
      if(needle.length()>haystack.length()|| needle.length()==0){
        return -1;
      }
      int ans=-1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
          int k=0;
            if(haystack.charAt(i)==needle.charAt(k)){
                   int j=i;
                   ans=i;
                 while(j<haystack.length() && k<needle.length()){
                      if(haystack.charAt(j)==needle.charAt(k)){
                             j++;
                             k++;
                      }else{
                             ans=-1;
                             break;
                      }
                 }
                 if(k==needle.length()){// If all characters of `needle` are matched
                     return ans;
                 }
            }
        }
        return ans;
    }
}
