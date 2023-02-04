
        class Solution {
    public int countAsterisks(String s) {
        int c=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                b=b+1;
            }
            if(b%2==0){
                if(s.charAt(i)=='*'){
                    c=c+1;
                }
            }
        }
            return c;
        
    }
        }
    