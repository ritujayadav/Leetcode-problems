class Solution {
    public static int dsy(int weights[],int cap)
    {
      int lo=0;
      int d=1;
        for(int i=0;i<weights.length;i++){
       
            if(lo+weights[i]>cap){
                 
                d+=1;
                  lo=weights[i];
            }else{
                lo+=weights[i];
            }
            
        }
        return d;
    }
    public int shipWithinDays(int[] weights, int days) {

        
        
        
        int l=Integer.MIN_VALUE;
        int h=0;
        for(int i=0;i<weights.length;i++){
            h=h+weights[i];
            l=Math.max(weights[i],l);
        }
        while(l<=h){
            int m=(l+h)/2;
            int x=dsy(weights,m);
            if(x<=days){
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return l;
    }
}