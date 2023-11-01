class Solution {
    public static String sort(String x){
        char sc[]=x.toCharArray();
           Arrays.sort(sc);
               return new String(sc);
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
         
        return false;    
        }
        s=sort(s);
        t=sort(t);
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=t.charAt(i)){
                    return false;
                }
            }
        return true;
        }
    }