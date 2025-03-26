/*You are given a 2D integer grid of size m x n and an integer x. In one operation, you can add x to or subtract x from any element in the grid.
A uni-value grid is a grid where all the elements of it are equal.
Return the minimum number of operations to make the grid uni-value. If it is not possible, return -1.
Example 1:
Input: grid = [[2,4],[6,8]], x = 2
Output: 4
Explanation: We can make every element equal to 4 by doing the following: 
- Add x to 2 once.
- Subtract x from 6 once.
- Subtract x from 8 twice.
A total of 4 operations were used.
Example 2:
Input: grid = [[1,5],[2,3]], x = 1
Output: 5
Explanation: We can make every element equal to 3.
Example 3:
Input: grid = [[1,2],[3,4]], x = 2
Output: -1
Explanation: It is impossible to make every element equal.
*/



// import java.util.*;
// class Solution {
//     public int minOperations(int[][] grid, int x) {
//         List<Integer> values = new ArrayList<>();
//         int m = grid.length, n = grid[0].length;  
//         // Step 1: Convert grid into a list and check feasibility
//         int remainder = grid[0][0] % x;
//         for (int[] row : grid) {
//             for (int num : row) {
//                 if (num % x != remainder) {
//                     return -1;  // Not possible
//                 }
//                 values.add(num);
//             }
//         }     
//         // Step 2: Sort and find median
//         Collections.sort(values);
//         int median = values.get(values.size() / 2);
        
//         // Step 3: Calculate the minimum operations
//         int operations = 0;
//         for (int num : values) {
//             operations += Math.abs(num - median) / x;
//         }
        
//         return operations;
//     }
// }

class Solution {
    public int minOperations(int[][] grid, int x) {
        
        int n = grid.length;
        int m = grid[0].length;
         int rem = grid[0][0] % x;
        int arr[] = new int[n*m];
        int k=0;
         for(int i = 0; i<n; i++) {
             for(int j = 0; j<m; j++) {
                 if(grid[i][j] % x != rem) return -1;
                arr[k] = grid[i][j];
                k++;
             }
        }

         int median = (arr.length)  / 2;
        Arrays.sort(arr);
         int sum = 0;
         for(int i=0;i<arr.length;i++){
            sum+=(Math.abs(arr[i] - arr[median]))/x;
         }       
         return sum;
    }
}
