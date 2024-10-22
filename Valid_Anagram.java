//Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.

import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                 map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                 map.put(t.charAt(i),map.get(t.charAt(i))-1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))!=0 ){
                return false;
            }
        }
        return true;
    }
}
