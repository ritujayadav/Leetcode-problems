class Solution {
    public int rob(int[] nums) {
        int l=nums.length;
        if(l<=1){
            return nums[0];
        }

   int leavefirst[]=new int[nums.length-1];
    int levlast[]=new int[nums.length-1];
        
    for(int i=0;i<l-1;i++){
    leavefirst[i]=nums[i];
    levlast[i]=nums[i+1];
    }
       int x=robi(leavefirst);
         int y=robi(levlast);
        
       
        int maxi=Math.max(x,y);
        return maxi;
    }

  public int robi(int[] nums) {
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
    
return neww[nums.length-1];
        
    }
}