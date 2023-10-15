class Solution {
   public static int fun(int piles[],int curr){
    int total=0;
    for(int i=0;i<piles.length;i++){
        total+=Math.ceil((double)piles[i]/curr);
        
    }
    
    return total;
}
    
   public static int maxi(int[] piles){
        int f=Integer.MIN_VALUE;
       
        for(int i=0;i<piles.length;i++){
      
                f=Math.max(f,piles[i]);
            }
    return f;
        }
 public int minEatingSpeed(int[] piles, int h) {
    int l=1;
     int hig=maxi(piles);
     while(l<=hig){
        int m=(l+hig)/2;
            int x=fun(piles,m);
            if(x<=h){
                hig=m-1;
            }else{
                l=m+1;
            }
        }         
    return l;
}
}