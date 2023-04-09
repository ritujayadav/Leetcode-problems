class Solution {
public int numSquares(int n) {
int []x = new int[n+1];
x[0] = 0;
x[1] = 1;

    for(int i =2;i<=n;i++) {
        int min = Integer.MAX_VALUE;
        for(int j =1;j*j<=i;j++) {
            int r = i- j*j;
            if(x[r]<min) {
                min = x[r];
            }
        }
        x[i] = min + 1;
    }
    return x[n];
}
}