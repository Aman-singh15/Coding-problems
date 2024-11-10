//Given an integer x, return true if x is a palindrome, and false otherwise.
class Solution {
    public boolean isPalindrome(int x) {
        int reverse=isPalindromehelper(x);
        if(reverse==x){
            return true;
        }else
        return false;
    }
    public int isPalindromehelper(int x){
        int reversed=0;
        while(x>0){
           reversed=reversed*10+x%10;
           x=x/10;
        }
        return reversed;
    }
}
