class Solution {
    public int maxProduct(int[] nums) {
    Arrays.sort(nums);
    int k=nums[nums.length-2]-1;
        int k1=nums[nums.length-1]-1;
            return k*k1;
        
    }
    
}
