/*Geek is learning data structures, and he recently learned about the top-down and bottom-up dynamic programming approaches. Geek is having trouble telling them apart from one another.
When given an integer n, where n is based on a 0-based index, find the nth Fibonacci number.
Every ith number in the series equals the sum of the (i-1)th and (i-2)th numbers, where the first and second numbers are specified as 0 and 1, respectively.
For the given issue, code both top-down and bottom-up approaches.
Note : As the answer might be large, return the final answer modulo 109 + 7
Example 1:
Input:
n = 5
Output: 5
Explanation: 0,1,1,2,3,5 as we can see 5th number is 5.
Example 2:
Input:
n = 6
Output: 8
Explanation: 0,1,1,2,3,5,8 as we can see 6th number is 8.
Constraints:
1 <= n <= 104
Your Task:
You don't need to read input or print anything. Your task is to complete two functions topDown() and bottomUp() which take n as input parameters and return the nth Fibonacci number.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)
*/

class Solution {
     static final int MOD = 1_000_000_007;
     
    static long topDown(int n) {// memoizzation
        long storage[]=new long[n+1];
        for(int i=0;i<n+1;i++){
            storage[i]=-1;
        }
        return memo(n,storage);
    }
    static long memo(int n,long[]storage){
        if(n==0 || n==1){
            storage[n]=n;
            return storage[n];
        }
        if(storage[n]!=-1){
            return storage[n];
        }
           return storage[n] = (memo(n - 1, storage) + memo(n - 2, storage)) % MOD;
    }

    static long bottomUp(int n) {// DP
        long storage[]=new long[n+1];
        storage[0]=0;
        storage[1]=1;
        for(int i=2;i<=n;i++){
            storage[i]=(storage[i-1]+storage[i-2])%MOD;
        }
        return storage[n];
    }
}
