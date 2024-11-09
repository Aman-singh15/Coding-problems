/*The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
Given two integers x and y, return the Hamming distance between them.
Example 1:
Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.*/
  
class Solution {
    public int hammingDistance(int x, int y) {
        //Approach1:- String manipulation
        // StringBuilder string1 =new StringBuilder(Integer.toBinaryString(x));
        // StringBuilder string2 = new StringBuilder(Integer.toBinaryString(y));
        // if(string1.length()!=string2.length()){
        //     if(string1.length()>string2.length()){
        //         int n=string1.length();
        //           while(string2.length()<n){
        //             string2.insert(0, '0');
        //           }
        //     }else{
        //         while(string1.length()<string2.length()){
        //             string1.insert(0, '0');
        //         }
        //     }
        // }
        // int pos=0;
        // for(int i=0;i<string1.length();i++){
        //     if(string1.charAt(i)!=string2.charAt(i)){
        //         pos++;
        //     }
        // }
        // return pos;
        //Approach 2:-Bit manipulation
            int n=x^y;
            int c=0;
              while(n!=0){
                n=n&(n-1);
                c++;
              }
              return c;
    }
}
