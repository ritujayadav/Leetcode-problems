class Solution {
    public static  void exam(int index,int sum,ArrayList<Integer> curr,List<List<Integer>> ans,int[] nums){
    
   ans.add(new ArrayList<>(curr));
    for(int i=index;i<nums.length;i++){
     if( i!=index && nums[i]==nums[i-1] ){
         continue;
     } 
        curr.add(nums[i]);
    
    exam(i+1,sum,curr,ans,nums);
        
        curr.remove(curr.size()-1);
    }
    
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
     ArrayList<Integer> curr=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
    exam(0,0,curr,ans,nums);
    return ans;
    }
}