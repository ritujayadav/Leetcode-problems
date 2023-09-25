class Solution {
    public int maxProfit(int[] prices) {
     int p=0;
        int m=prices[0];
        for(int i=0;i<prices.length;i++){
            m=Math.min(m,prices[i]);
            p=Math.max(p,prices[i]-m);
        }
    
    return p;
    }
}

