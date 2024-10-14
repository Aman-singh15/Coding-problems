// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal 
// substring
//  consisting of non-space characters only.
   class Solution {
    public int lengthOfLastWord(String s) {
      //  String[]arr= s.split(" ");
      int count=0;
      int i=s.length()-1;
     for (; i >= 0 && s.charAt(i) == ' '; i--) {
        // Just moving the index to skip spaces
    }
        for(;i>=0 && s.charAt(i)!=' ';i--){
            if(s.charAt(i)==' '){
                 return count;
            }else{
                count++;
            }
        }
        return count;
    }
}
//2nd Approach
// class Solution {
//     public int lengthOfLastWord(String s) {
//         String[] arr = s.split(" ");// put one word in array on each space found
//         String s2 = arr[arr.length-1];
//     return s2.length();}
// }
