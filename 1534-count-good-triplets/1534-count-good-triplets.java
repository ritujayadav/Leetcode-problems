class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        
        int ap=0;
        int len = arr.length;
        
        for(int i=0;i<len-2;i++){
            
            for(int j=i+1;j<len -1;j++){
                
                for(int k = j+1;k<len;k++){
                    
                    int v1 = (arr[i] > arr[j])? arr[i]-arr[j]:arr[j]-arr[i];
                    int v2 = (arr[j] > arr[k])? arr[j]-arr[k]:arr[k]-arr[j];
                    int v3 = (arr[i] > arr[k])? arr[i]-arr[k]:arr[k]-arr[i];
                    
                    if(v1 <= a && v2 <=b && v3 <=c)
                        ap=ap+1;
                }
            }
        }
        return ap;
    }
}