//Given an integer array nums of unique elements, return all possible subsets(the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order.
// Example 1:
// Input: nums = [1,2,3]
// Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// Example 2:
// Input: nums = [0]
// Output: [[],[0]]
 
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>>ans=new ArrayList<>();
         ArrayList<Integer>list=new ArrayList<>();
           Arrays.sort(nums);
         subset(nums,0,list,ans);
         return ans;
    }
    public void subset(int[]nums,int index,List<Integer>list,List<List<Integer>>ans){
      if(index==nums.length){
        ans.add(new ArrayList<>(list));
       list=new ArrayList<>();
        return;
      }
       list.add(nums[index]);//picking up
       subset(nums,index+1,list,ans);

      list.remove(list.size() - 1);
       while (index + 1 < nums.length && nums[index] == nums[index + 1]) {
            index++;
        }
      //not include(not picking up)
      subset(nums,index+1,list,ans);

    }
}
