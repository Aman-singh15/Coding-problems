/*Given an integer n representing number of vertices. Find out how many undirected graphs (not necessarily connected) can be constructed out of a given n number of vertices.
Example 1:
Input: 2
Output: 2
Example 2:
Input: 5
Output: 1024
*/


class Solution {
    static long count(int n) {
        // code here
        int totaledges = n*(n-1)/2;
        long ans =(long)Math.pow(2,totaledges);
        return ans;
    }
}
