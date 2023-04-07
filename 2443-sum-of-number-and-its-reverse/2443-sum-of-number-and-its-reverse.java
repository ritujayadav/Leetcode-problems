
class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        int reverse = 0;
        if(num == 0) return true;
        for(int i = 0;i<num;i++){
            int number = i;
            while(number != 0)   
            {  
                int remainder = number % 10;  
                reverse = reverse * 10 + remainder;  
                number = number/10;  
            }  
            if(i+reverse == num){
                return true;
            }
            else{
                reverse = 0;
            }
        }
        return false;
    }
}