class Solution {
public String removeOuterParentheses(String s) {
    String a="";
    int c=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            c++;
            
        }
        if(c>1)
        {
            a=a+s.charAt(i);
        }            
        if(s.charAt(i)==')'){
            c--;
        }
    }
    return a;
    
    }
}    


