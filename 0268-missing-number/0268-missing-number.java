class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        int j=nums.length;
        int sum = (j * (j + 1)) / 2;
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
        }
        int ko=sum-s;
        return ko;
    }
}