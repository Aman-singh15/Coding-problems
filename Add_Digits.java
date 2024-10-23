//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
class Solution {
    public int addDigits(int num) {
        if(num%10==num){
            return num;
        }
        int count=0;
        while(num>0){
            int k=num%10;
             count+=k;
            num=num/10;
            
        }
        return addDigits(count);
    }
}
