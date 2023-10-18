class Solution {
   
    public boolean days(int nums[],int mid,int m,int k){
     int f=0,b=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                f++;
            }
            else{
                f=0;
            }
            if(k==f){
                b++;
                f=0;
            }
        }
        
        return b>=m;
    }
    public int minDays(int[] bloomDay, int m, int k){
        
        if(bloomDay.length<m){
            return -1;
        }
        int low=bloomDay[0];
        int high=bloomDay[0];
        int result=-1;
        for(int i=1;i<bloomDay.length;i++){
            low=Math.min(bloomDay[i],low);
            high=Math.max(bloomDay[i],high);
        }
        
        while(low<=high){
            int mid=(low+high)/2;
            
            if(days(bloomDay,mid,m,k)){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return result;
    }
}