class Solution {
    public int[] leftRightDifference(int[] nums) {
        
        int l[]=new int[nums.length];
        int r[]=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            l[i]=l[i-1]+nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            r[i]=r[i+1]+nums[i+1];
        }
         for(int i=0;i<nums.length;i++){
         nums[i]=Math.abs(l[i]-r[i]);
         }
        return nums;
        
        
    }
}
