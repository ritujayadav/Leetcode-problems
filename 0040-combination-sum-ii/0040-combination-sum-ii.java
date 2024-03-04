class Solution {
    public static void example(int index,int target,List<Integer> curr,List<List<Integer>> ans,int []arr){

        if(target==0){
            ans.add(new ArrayList<>(curr));
        
    }
        for(int i=index;i<arr.length;i++){
if(i>index && arr[i]==arr[i-1]){
    continue;
}
        
        
        if(arr[i]>target){
            break;
        }
    
            curr.add(arr[i]);
            example(i+1,target-arr[i],curr,ans,arr);
            curr.remove(curr.size()-1);
        }
     
        
    }
    
    
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(candidates);
        example(0,target,curr,ans,candidates);
        return ans;
        
    }
}