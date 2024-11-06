//Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
//You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0||carry>0){
            int digit1=0;
            int digit2=0;
            if(i>=0){
                digit1=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                digit2=num2.charAt(j)-'0';
                j--;
            }
            int sum=digit1+digit2+carry;
            carry=sum/10;
            result.append(sum%10);
        }
        return result.reverse().toString();
    }
}
