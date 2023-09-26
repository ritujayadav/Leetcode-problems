class Solution {
    public void rotate(int[][] matrix) {
    
        int n=matrix.length;
        int x[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
          
                x[i][j]=matrix[n-1-j][i];
                
            }
        }
for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=x[i][j];
    }
}
    }
}
