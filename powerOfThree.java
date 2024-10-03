class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1){//for case 3to Power 0 is 1
            return true;
        }
        if(n%3!=0){
            return false;
        }
        return n>0 && isPowerOfThree(n/3);
    }
}
