/*Given a triangle array, return the minimum path sum from top to bottom.
For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
Example 1:
Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
Output: 11
Explanation: The triangle looks like:
   2
  3 4
 6 5 7
4 1 8 3
The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
Example 2:
Input: triangle = [[-10]]
Output: -10
*/


class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
         if(triangle.size()==1){
            return Collections.min(triangle.get(0));
         }
         int storage[][] = new int[triangle.size()][triangle.size()];
        for (int[] row : storage) {
           Arrays.fill(row, -1);
         }
         return TriangleMemo(storage,triangle,0,0);
    }
    public int TriangleMemo(int[][]storage,List<List<Integer>> triangle,int row,int column){
        if(row==triangle.size()-1){
             return triangle.get(row).get(column);
        }
        if(row<0){
          return 0;
        }
        if(storage[row][column]!=-1){
            return storage[row][column];
        }
         int sum1=TriangleMemo(storage,triangle,row+1,column);// ifgoes towards i
         int sum2=TriangleMemo(storage,triangle,row+1,column+1);// if goes to i+1
         return storage[row][column]=Math.min(sum1,sum2)+triangle.get(row).get(column);
        
    }
}
