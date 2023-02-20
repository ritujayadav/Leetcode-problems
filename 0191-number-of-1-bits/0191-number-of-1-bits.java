public class Solution {
    // you need to treat n as an unsigned value
   
    public int hammingWeight(int s) {
        String n = Integer.toBinaryString(s);
         int c=0;
        for(int i=0;i<n.length();i++){
            if (n.charAt(i)=='1'){
                c=c+1;
            }
        }
        return c;
    }
}