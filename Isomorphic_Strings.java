// Given two strings s and t, determine if they are isomorphic.
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
  class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()==0|| t.length()==0){
            return false;
        }
        int[]arr1=new int[200];
        int[]arr2=new int[200];
         if(t.length()!=s.length()){
            return false;
         }
        for(int i=0;i<s.length();i++){
            if(arr1[s.charAt(i)]!=arr2[t.charAt(i)]){
                return false;
            }
            arr1[s.charAt(i)]=i+1;
            arr2[t.charAt(i)]=i+1;
        }
         return true;
    }
}
// Approach 2:-
 
// public boolean isIsomorphic(String s, String t) {
//         final int[] map1 = new int[128];
//         final int[] map2 = new int[128];
//         final char[] sc = s.toCharArray();
//         final char[] tc = t.toCharArray();
        
//         for (int i = s.length() - 1; i >= 0; i--) {
//             if (map1[sc[i]] != map2[tc[i]])  return false;
//             map1[sc[i]] = map2[tc[i]] = i;
//         }
//         return true;
//     }
// }
