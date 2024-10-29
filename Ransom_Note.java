// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//Each letter in magazine can only be used once in ransomNote.
import java.util.HashMap;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    //     HashMap<Character,Integer>map=new HashMap<>();
    //     for(int i=0;i<ransomNote.length();i++){
    //         char key=ransomNote.charAt(i);
    //         map.put(key, map.getOrDefault(key, 0) - 1);
    //     }

    //     for(int i=0;i<magazine.length();i++){
    //         char key=magazine.charAt(i);
    //         map.put(key, map.getOrDefault(key, 0) + 1);
    //     }
    //    // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    //           for (Character key : map.keySet()) {
    //         int x=map.get(key);
    //         if(x<0) return false;
    //     }

    //     return true;
      //Approach 2...
        int data[]=new int[26];
        for(int i=0;i<magazine.length();i++){
            data[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(data[ransomNote.charAt(i)-'a']==0){
                return false;
            }
            data[ransomNote.charAt(i)-'a']--;
        }
        return true;

    }
}

 
