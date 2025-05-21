/*
Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
You must do it in place.
Example 1:
Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
Output: [[1,0,1],[0,0,0],[1,0,1]]
Example 2:
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
Constraints:
m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
*/



// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int rows = matrix.length;
//         int column = matrix[0].length;
//         int marker = Integer.MIN_VALUE + 1;
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < column; j++) {
//                 if (matrix[i][j] == 0) {
//                     for (int k = 0; k < column; k++) {
//                         if (matrix[i][k] != 0 && matrix[i][k] != marker) {
//                             matrix[i][k] = marker;
//                         }
//                     }
//                     for (int l = 0; l < rows; l++) {
//                         if (matrix[l][j] != 0 && matrix[l][j] != marker) {
//                             matrix[l][j] = marker;
//                         }
//                     }
//                 }
//             }
//         }
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < column; j++) {
//                 if (matrix[i][j] == marker) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }

class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
