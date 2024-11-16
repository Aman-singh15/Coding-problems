//You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
// Example 1:
// Input: n = 2
// Output: 2
// Explanation: There are two ways to climb to the top.
// 1. 1 step + 1 step
// 2. 2 steps

class Solution {
    public int climbStairs(int n) {
        // if(n==1){
        //     return 1;
        // }
        // if(n==2){
        //     return 2;
        // }
        // int option1=climbStairs(n-1);
        // int option2=climbStairs(n-2);
        // return option1+option2;
        int storage[]=new int[n+1];
        storage[0]=1;
        for(int i=1;i<storage.length;i++){
            int option1=storage[i-1];
            int option2=0;
            if(i-2>=0){
                option2=storage[i-2];
            }
            storage[i]=option1+option2;
        }
        return storage[n];
    }
}
