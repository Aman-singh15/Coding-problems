//Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
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
