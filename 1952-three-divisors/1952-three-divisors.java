class Solution {
    public boolean isThree(int n) {
        int k=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                
                k++;
            }
        }
        if(k==3){
            return true;
        }
            return false;
        
    }
}

