class Solution {
    public int maxSubArray(int[] nums) {
       int x=0;
        int m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            x+=nums[i];
            if(x>m){
                m=x;
            }
        if(x<0){
            x=0;
        }
        }
        
        return m;
    }
}