class Solution {
    public String reverseWords(String s) {
        String[] x=s.split("\\s+");
        StringBuilder r=new StringBuilder();
        for(int i=x.length-1;i>=0;i--){
            r.append(x[i]).append(" ");
        }    
        return r.toString().trim();
        }
          
    
}
           