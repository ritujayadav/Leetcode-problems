class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        int r= 0;
        if(num == 0) return true;
        for(int i = 0;i<num;i++){
            int n = i;
            while(n != 0)   
            {  
                int rm = n % 10;  
                r = r* 10 + rm;  
                n = n/10;  
            }  
            if(i+r == num){
                return true;
            }
            else{
                r = 0;
            }
        }
        return false;
    }
}
