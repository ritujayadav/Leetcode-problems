class Solution {
    public int trap(int[] height) {
      
int pre[]=new int[height.length];
          int suf[]=new int[height.length];
        int pmax=Integer.MIN_VALUE;
        
        for(int i=0;i<height.length;i++){
                if(height[i]>=pmax){
                    pmax=height[i];
                }
                    pre[i]=pmax;
                
        }
        int smax=Integer.MIN_VALUE;

          for(int i=height.length-1;i>=0;i--){
            if(height[i]>=smax){
                smax=height[i];
            }
                suf[i]=smax;
            
            
    }
int c=0;
int x[]=new int[height.length];
for(int i=0;i<height.length;i++){
        c+=Math.min(pre[i],suf[i])-height[i];
}

        
return c;
}
}