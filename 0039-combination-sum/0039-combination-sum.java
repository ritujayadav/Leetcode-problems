class Solution {
    
    public void example(int index,int target,List<Integer> current,List<List<Integer>> ans,int[] arr){
        
        if(index==arr.length){
        if(target==0){
        ans.add(new ArrayList<>(current));    
        }    
            return;
        }
        if(arr[index]<=target){
            current.add(arr[index]);
            example(index,target-arr[index],current,ans,arr);
            
            current.remove(current.size()-1);
        }
      
            example(index+1,target,current,ans,arr);
        
    }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
 List<Integer> current = new ArrayList<>();
        example(0,target,current,ans,candidates);
        return ans;
        
    }
}