class Solution {
    public int[] sumZero(int n) {
 
int [] r = new int[n];
int sum = 0;

    for(int i = 1 ; i < n ; i++) {
        r[i] = i;
        sum += i;
    }
    
    r[0] = -sum;
    
    return r;
}
}
        
        
        
    
