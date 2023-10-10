class Solution {
    public boolean search(int[] nums, int target) {
        boolean x=false;
        for(int i=0;i<nums.length;i++){
if(nums[i]==target){
    x=true;
}
        }
    return x;
    }
    
}