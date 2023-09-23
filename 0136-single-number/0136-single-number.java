class Solution {
    public int singleNumber(int[] nums) {
    
    for(int i=0;i<nums.length;i++){
            int c=0;
        int x=nums[i];
        for(int j=0;j<nums.length;j++){
            if(nums[j]==nums[i]){
                c++;
            }
        }
        if(c==1){
            return x;
        }
    }
 return -1;   
}
}