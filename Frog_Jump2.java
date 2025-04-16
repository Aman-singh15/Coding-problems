/*Given an array arr[] of size n, where arr[i] denotes the height of ith stone. Geek starts from stone 0 and from stone i, he can jump to stones i + 1, i + 2, … i + k. The cost for jumping from stone i to stone j is abs(arr[i] – arr[j]). Find the minimum cost for Geek to reach the last stone.
Example:
Input: k = 3, arr[]= [10, 30, 40, 50, 20]
Output: 30
Explanation: Geek will follow the path 1->2->5, the total cost would be |10-30| + |30-20| = 30, which is minimum.
Input: k = 1, arr[]= [10, 20, 10]
Output: 20
Explanation: Geek will follow the path 1->2->3, the total cost would be |10 - 20| + |20 - 10| = 20.
Constraints:
1 <= arr.size() <=104
1 <= k <= 100
1 <= arr[i] <= 104

*/

// Approach 1:- Using Top down DP(Memoization)
// class Solution {
//     public int minimizeCost(int k, int arr[]) {
        
//         int storage[]=new int[arr.length];
//         Arrays.fill(storage,-1);
//         return memoCost(storage,arr,k,arr.length-1);
//     }
//     public int memoCost(int[]storage,int arr[],int k,int index){
//         if(index==0){
//             return 0;
//         }
//         if(storage[index]!=-1){
//             return storage[index];
//         }
//         int minCost=Integer.MAX_VALUE;
//         for(int i=1;i<=k;i++){
//             if(index-i>=0){
//                 int cost=Math.abs(arr[index]-arr[index-i])+memoCost(storage,arr,k,index-i);
//                 minCost=Math.min(minCost,cost);
//             }
//         }
//         return storage[index]=minCost;
        
//     }
// }

// DP(Bottom up approach)
class Solution {
    public int minimizeCost(int k, int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int minCost = Integer.MAX_VALUE;

            // Try all jumps from 1 to k
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int cost = dp[i - j] + Math.abs(arr[i] - arr[i - j]);
                    minCost = Math.min(minCost, cost);
                }
            }

            dp[i] = minCost;
        }

        return dp[n - 1];
    }
}
