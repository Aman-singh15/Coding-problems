/*Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:
Input: nums = [1], k = 1
Output: [1]  */


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        while(k>0){
          int max=Integer.MIN_VALUE;
          int key=Integer.MIN_VALUE;
          for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>max){
              max=entry.getValue();
              key=entry.getKey();
             // map.put(entry.getKey(),Integer.MIN_VALUE);    -> this throws a(ConcurrentModificationException) because we are Modifying the HahsMap during iteration.so we remove that key out of for loop.
            }
          }
          list.add(key);
          map.remove(key);
          k--;
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
