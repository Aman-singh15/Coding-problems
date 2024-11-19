//Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// Example 1:
// Input: strs = ["flower","flow","flight"]
// Output: "fl"

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0|| strs==null){
            return "";
        }
        int min=Integer.MAX_VALUE;
        StringBuilder prefix = new StringBuilder();
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
            }
        }
        for(int i=0;i<min;i++){
            char word=strs[0].charAt(i);
            for(int j=0;j<strs.length;j++){
                if(strs[j].charAt(i)!=word){
                    return  prefix.toString();
                }
            }
            prefix.append(word);
        }
        return prefix.toString();
    }
}
