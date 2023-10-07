class Solution {
    public int findPeakElement(int[] nums) {
        int x=0;
    for(int i=0;i<nums.length;i++){
    if((i==0 || nums[i-1]<nums[i]) && (i==nums.length-1|| nums[i+1]<nums[i])){
    x=i;
}
        }
        return x;
    }
}