class Solution {
    public int hammingDistance(int x, int y) {
        int c = 0;
        while(x!=0||y!=0)
        {   
            int a =x&1;
            int b = y&1;
            if(a!=b){
            c++;
            }
            x>>=1;
            y>>=1;
        }
        return c;   
    }

}