// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
// Return the kth positive integer that is missing from this array.

 class Solution {
    public int findKthPositive(int[] arr, int k) {
        int arr1[]=new int[1002];//array which contain correct sequence
        int m=0;
        int K=0;
        int n=0;
        int s=0;
        int[]ans=new int[1000];// array for storing answer
        for(int i=0;i<arr1.length-1;i++){
            arr1[i]=i+1;
        }
           while(m<arr[arr.length-1]){
            if(arr[s]==arr1[n]){//comparing the elements of both the arrays
                 s++;
                 n++;
                 m++;
                
            }else{//if any sequence is missing then put it into our answer array
                ans[K]=arr1[n];
                K++;
                m++;
                n++;     
            }
        }
        int t;//we will do it to store the sequence which is after our input array elements contain
        if(s>n){
            t=s;
        }else{
            t=n;
        }
        for(int j=K;j<ans.length;j++){//this covers all the index of answer array with correct missing elements
            ans[j]=t+1;
            t++;
        }
        return ans[k-1]; 
    }
}
