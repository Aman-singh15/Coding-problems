/*You are playing the following Nim Game with your friend:
Initially, there is a heap of stones on the table.
You and your friend will alternate taking turns, and you go first.
On each turn, the person whose turn it is will remove 1 to 3 stones from the heap.
The one who removes the last stone is the winner.
Given n, the number of stones in the heap, return true if you can win the game assuming both you and your friend play optimally, otherwise return false.
Example 1:
Input: n = 4
Output: false
Explanation: These are the possible outcomes:
1. You remove 1 stone. Your friend removes 3 stones, including the last stone. Your friend wins.
2. You remove 2 stones. Your friend removes 2 stones, including the last stone. Your friend wins.
3. You remove 3 stones. Your friend removes the last stone. Your friend wins.
In all outcomes, your friend wins.
Example 2:
Input: n = 1
Output: true
Example 3:
Input: n = 2
Output: true  */


// class Solution {
//     public boolean canWinNim(int n) {
//           return n % 4 != 0; // If n % 4 == 0, no matter how many stones you take (1, 2, or 3), your friend can always take the remainder when both play optionally (4 minus your move) and leave you with another multiple of 4. but if n%4!=0 then you will win as you  leave your friend with a multiple of 4.
//     }
// }
class Solution {
    public boolean canWinNim(int n) {
        while (n>0) {
            if (n <= 3) {
                return true;
            }
            if (n==4) {
                return false;
            }
            n -= 4;         
        }
        return false;

    }
}
