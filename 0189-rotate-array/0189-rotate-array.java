class Solution {
    public void rotate(int[] nums, int k) {
          int z=nums.length;
     int[]n=new int[z];
      
       
     for(int i=0;i<z;i++)
     {
         n[(i+k)%z]=nums[i];
     }   
    for(int i=0;i<nums.length;i++){
        nums[i]=n[i];
    }
   
    }
}
