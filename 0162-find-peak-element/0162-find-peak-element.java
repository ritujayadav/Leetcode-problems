class Solution {
    public int findPeakElement(int[] nums) {
        int x=0;
    for(int i=0;i<nums.length-1;i++){
    if(nums[i]>nums[i+1]){
    x=i;
        break;
}
        else{
            x=i+1;
        }
        }
        return x;
    }
}