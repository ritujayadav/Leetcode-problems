class Solution {
    public int[] searchRange(int[] nums, int target) {
        int x=-1;
        int y=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)   {
                x=i;
                break;
            } 
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                y=j;
                break;
            }
        }
        int k[]=new int[2];
        for(int i=0;i<1;i++){
            k[i]=x;
            k[i+1]=y;
        }
        return k;
    }
            }
        
    
