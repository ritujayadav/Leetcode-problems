class Solution {
    public int searchInsert(int[] nums, int target) {
   int l=0;
        int x=nums.length;
        int h=nums.length-1;
        while(l<=h){
                 int m=(l+h)/2;
          
             if(nums[m]>=target){
                x=m;
                h=m-1;
              
            }
            else{
  l=m+1;
            }
        }
    
        return x;
    }
}