/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
  */
class Solution {
    public int romanToInt(String s) {
        char ch[]=s.toCharArray();
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            int current=valueOfroman(ch[i]);
            int nextCurrent=valueOfroman(ch[i+1]);
            if(current<nextCurrent){
                count-=current;
            }else{
                count+=current;
            }
        }
         count+=valueOfroman(ch[s.length()-1]);
        return count;
    }
    public int valueOfroman(char a){
        switch(a){
            case 'I':
            return 1;
            case 'V':
            return 5;
            case 'X':
            return 10;
            case 'L':
            return 50;
            case 'C':
            return 100;
            case 'D':
            return 500;
            case 'M':
            return 1000;
            default:
            return 0;
        }
    }
}
