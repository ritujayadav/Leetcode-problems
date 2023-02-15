class Solution {
    public boolean isHappy(int n) {
 
        while(n>=10){
            int t=0;
            while(n>0){
            t+=(n%10)*(n%10);
            n/=10;}
            n=t;
        }
        if(n==1||n==7){ return true;
                      }return false;
    }
}