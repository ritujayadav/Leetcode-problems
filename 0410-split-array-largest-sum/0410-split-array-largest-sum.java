class Solution {
    public int count(int[] nums,int m){
        int sum=0;
        int p=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]+sum<=m){
                sum+=nums[i];
            }else{
                p+=1;
                sum=nums[i];
            }
        }
        return p;
    }
    public int maxi(int[] nums){
        int k=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>k){
                k=nums[i];
            }
        }
        return k;
    
    }
    public int sumi(int[] nums){
        int s=0;
        for(int i=0;i<nums.length;i++){
            s=s+nums[i];
        }
        return s;
    }
    
    public int splitArray(int[] nums, int k) {
    int l=maxi(nums);
        int h=sumi(nums);
    while(l<=h){
        int m=(l+h)/2;
        int c=count(nums,m);    
        if(c<=k){
            h=m-1;
        }
        else{
            l=m+1;
        }
    }
        
    
    return l;
}
}