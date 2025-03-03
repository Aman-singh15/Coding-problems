/*You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:
Every element less than pivot appears before every element greater than pivot.
Every element equal to pivot appears in between the elements less than and greater than pivot.
The relative order of the elements less than pivot and the elements greater than pivot is maintained.
More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj.
Return nums after the rearrangement.
Example 1:
Input: nums = [9,12,5,10,14,3,10], pivot = 10
Output: [9,5,3,10,10,12,14]
Explanation: 
The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
*/



class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
      int arr[]=new int[nums.length];
     int k=0;
      int low=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[low]=nums[i];
                low++;
            }
         }
         for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                arr[low]=nums[i];
                low++;
            }
         }
             for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                arr[low]=nums[i];
                low++;
            }
         }
           
         return arr;
      // ArrayList<Integer>less=new ArrayList<>();
      // ArrayList<Integer>high=new ArrayList<>();
      // ArrayList<Integer>equal=new ArrayList<>();
      // int arr[]=new int [nums.length];
      // int k=0;
      // for(int i=0;i<nums.length;i++){
      //    if(nums[i]<pivot){
      //       less.add(nums[i]);
      //    }else if(nums[i]>pivot){
      //     high.add(nums[i]);
      //    }else{
      //     equal.add(nums[i]);
      //    }
      // }
      //  for(int i=0;i<less.size();i++){
      //     arr[k]=less.get(i);
      //     k++;
      //  }
      //  for(int i=0;i<equal.size();i++){
      //     arr[k]=equal.get(i);
      //     k++;
      //  }
      //   for(int i=0;i<high.size();i++){
      //     arr[k]=high.get(i);
      //     k++;
      //  }
      //  return arr;
    }
}
