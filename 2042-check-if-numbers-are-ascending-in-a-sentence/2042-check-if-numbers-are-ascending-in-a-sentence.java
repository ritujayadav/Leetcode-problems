class Solution {
public boolean areNumbersAscending(String ts) {

    String[] t = ts.split(" ");
    
    int n=0;
    for(String s:t){
        if(Character.isDigit(s.charAt(0))){
            int nw= Integer.parseInt(s);
            if(nw<=n){
                return false;
            }
            n=nw;
        }
    }
    return true;
}
}