class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int m=nums[0];
        
        for(int i=1;i<nums.length;i++) {
            if(nums[i]<nums[i-1]){
                m=nums[i];
                break;
            }
        }
        
        return m;
    }
}
