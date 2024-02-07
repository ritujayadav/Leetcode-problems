class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       
            List<List<Integer>> res=new ArrayList<>();
        
        func(res,new ArrayList<>(),nums,0);
            return res;
                                                                                                
    }
    private void func(List<List<Integer>> res,List<Integer>temp,int[] nums,int start){
        
        //base case
        res.add(new ArrayList<>(temp));
        
        //including 
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
        
        
        //backtracking
        func(res,temp,nums,i+1);
        
        //not including
        temp.remove(temp.size()-1);
        }
    }
}