/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
For example, "Hello World", "HELLO", "hello world hello world" are all sentences.
Words consist of only uppercase and lowercase English letters. Uppercase and lowercase English letters are considered different.
A sentence is circular if:
The last character of a word is equal to the first character of the next word.
The last character of the last word is equal to the first character of the first word
  Input: sentence = "leetcode exercises sound delightful"
Output: true*/
  
class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1)){
            return false;
        }
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                if(sentence.charAt(i-1)!=sentence.charAt(i+1)){
                    return false;
                }
            }
        }
        return true;
    }
}
