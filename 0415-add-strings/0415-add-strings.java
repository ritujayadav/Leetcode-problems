import  java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger b=new BigInteger(num1);
        BigInteger c=new BigInteger(num2);
        return (b.add(c)).toString();
    }
}
