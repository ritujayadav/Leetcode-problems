class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]>nums[i+1]){
               c+=1;
            }
        }
        if(c==0){
                return true;
            }
        else if(c>1){
            return false;
        }
        else if(nums[0]>=nums[nums.length-1]){
        return true;
    }else{
            return false;
        }
}
}
                
                
