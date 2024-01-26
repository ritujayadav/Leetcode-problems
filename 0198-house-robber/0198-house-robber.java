class Solution {
    public int rob(int[] nums) {
 int neww[]=new int[nums.length];
        if(nums.length<=1){
            return nums[0];
        }
else{
 

    neww[0]=nums[0];
    neww[1]=Math.max(nums[1],nums[0]);
    for(int i=2;i<nums.length;i++){
        neww[i]=Math.max(neww[i-2]+nums[i],neww[i-1]);
    }
    
}
        int x= neww[nums.length-1];
return x;
        
    }
}