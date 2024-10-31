//Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
// Example 1:
// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
  
import java.util.ArrayList;
import java.util.HashMap;
class Solution {
     public int[] intersect(int[] nums1, int[] nums2) {
        // Approach 1:-
    //     int n=nums2.length;
    //     ArrayList<Integer>arr=new ArrayList<>();
    //     boolean visited[]=new boolean[nums2.length];
    //     for(int i=0;i<nums1.length;i++){
    //         for(int j=0;j<nums2.length;j++){
    //             if(nums1[i]==nums2[j] && !visited[j]){
    //                 arr.add(nums1[i]);
    //                 visited[j]=true;
    //                 break;
    //             }
                
    //         }
    //     }
    //     int ans[]=new int[arr.size()];
    //     int k=0;
    //     for(int i=0;i<ans.length;i++){
    //         ans[k]=arr.get(i);
    //         k++;
    //     }
    //     return ans;
    // Approach 2 using HashMap:-
        HashMap<Integer,Integer>map1=new HashMap<>();
        for(int i=0; i<nums1.length;i++){
            if(map1.containsKey(nums1[i])){
                map1.put(nums1[i],map1.get(nums1[i])+1);
            }else{
                map1.put(nums1[i],1);
            }
        }
        HashMap<Integer,Integer>map2=new HashMap<>();
         ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map1.containsKey(nums2[i]) && map1.get(nums2[i])>0){
                     arr.add(nums2[i]);
                     map1.put(nums2[i],map1.get(nums2[i])-1);
            }
        }
        int ans[]=new int[arr.size()];
        int k=0;
        for(int i=0;i<ans.length;i++){
            ans[k]=arr.get(i);
            k++;
        }
           return ans;
    }
}
