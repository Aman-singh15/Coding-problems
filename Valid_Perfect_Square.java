//Given a positive integer num, return true if num is a perfect square or false otherwise.
// A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
// You must not use any built-in library function, such as sqrt.

class Solution {
    public boolean isPerfectSquare(int num) {
        // if(num==1){
        //     return true;
        // }
        // int n=num/2;
        // while(n>0){
        //     if(n*n==num){
        //         return true;
        //     }else{
        //         n--;
        //     }
        // }
        // return false;
      
    if (num == 1) {
        return true;
    }
    int start = 1;
    int end = num / 2;
    
    while (start <= end) {

        int mid = start + (end - start) / 2;

        if ((long)mid*mid == num) {
            return true;
        } else if ((long)mid * mid < num) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    
    return false;
}
}
