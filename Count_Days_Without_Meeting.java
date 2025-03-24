/*You are given a positive integer days representing the total number of days an employee is available for work (starting from day 1). You are also given a 2D array meetings of size n where, meetings[i] = [start_i, end_i] represents the starting and ending days of meeting i (inclusive).
Return the count of days when the employee is available for work but no meetings are scheduled.
Note: The meetings may overlap.
Example 1:
Input: days = 10, meetings = [[5,7],[1,3],[9,10]]
Output: 2
Explanation:
There is no meeting scheduled on the 4th and 8th days.
Example 2:
Input: days = 5, meetings = [[2,4],[1,3]]
Output: 1
Explanation:
There is no meeting scheduled on the 5th day.
Example 3:
Input: days = 6, meetings = [[1,6]]
Output: 0
Explanation:
Meetings are scheduled for all working days.  */

// Approach 1:- Using O(m x d) time complexity
// class Solution {
//     public int countDays(int days, int[][] meetings) {
//       boolean[] ans=new boolean[days+1];
//         for(int i=0;i<meetings.length;i++){
//           int range=meetings[i][0];
//           while(range<=meetings[i][1]){
//             ans[range]=true;
//             range++;
//           }
          
//         }
//         int count=0;
//         for(int i=1;i<ans.length;i++){
//            if(!ans[i]){
//             count++;
//            }
//         }
//         return count;
//     }
// }


// Approach 2:- Using O(m log m) instead of O(m × d).
import java.util.Arrays;

class Solution {
    public int countDays(int days, int[][] meetings) {
        // Sort meetings based on start time
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int freeDays = 0;
        int lastEnd = 0; 

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];

            // free days before this meeting starts
            if (start > lastEnd + 1) {
                freeDays += (start - lastEnd - 1);
            }      
            lastEnd = Math.max(lastEnd, end);
        }
        //  remaining free days after the last meeting
        if (lastEnd < days) {
            freeDays += (days - lastEnd);
        }

        return freeDays;
    }
}
