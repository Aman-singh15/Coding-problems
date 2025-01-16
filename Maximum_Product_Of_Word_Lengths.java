/*Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. If no such two words exist, return 0.
Example 1:
Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
Output: 16
Explanation: The two words can be "abcw", "xtfn".
Example 2:
Input: words = ["a","ab","abc","d","cd","bcd","abcd"]
Output: 4
Explanation: The two words can be "ab", "cd".
Example 3:
Input: words = ["a","aa","aaa","aaaa"]
Output: 0
Explanation: No such pair of words. */


class Solution {
    public int maxProduct(String[] words) {
      int max= 0;
      int ans=0;
        for(int i=0;i<words.length;i++){
           String word= words[i];
           HashMap<Character,Integer>map=new HashMap<>();
           for(int k=0;k<word.length();k++){
               map.put(word.charAt(k),map.getOrDefault(word.charAt(k),0)+1);
           }
           // compare the current word with all other words
           for(int j= i+1;j<words.length;j++){
               String word2= words[j];
                  boolean hasCommon = false;
           
               for(int t=0;t<word2.length();t++){
                    if(map.containsKey(word2.charAt(t))){
                           hasCommon=true;
                       break;
                   }
               }
               if (!hasCommon) {
                    ans = word.length() * word2.length();
                    max = Math.max(max, ans);
                }
           }
        }
        return max;
    }
}
