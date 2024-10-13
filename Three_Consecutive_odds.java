//Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
    class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3 ){
            return false;
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                 count++;
                 if(count==3){
                    return true;
                 }
            }else{
                count=0;
            }
        }
        return false;
    }
}
