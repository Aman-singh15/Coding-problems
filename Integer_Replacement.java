/*Given a positive integer n, you can apply one of the following operations:
If n is even, replace n with n / 2.
If n is odd, replace n with either n + 1 or n - 1.
Return the minimum number of operations needed for n to become 1.
Example 1:
Input: n = 8
Output: 3
Explanation: 8 -> 4 -> 2 -> 1*/
  
class Solution {
    public int integerReplacement(int n) {
        int count=0;
        while(n!=1){
            if(n==2147483647){
                return 32;
            }
            if(n%2==0){
                n=n/2;
                count++;
            }else{
                if(n == 3 || ((n >>> 1) & 1) == 0){// Decrement when n == 3 or when n's second-to-last bit is 0
                n=n-1;
                }else{
                    n=n+1;
                }
                count++;
            }
        }
           return count;
    }
}
