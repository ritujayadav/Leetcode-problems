class Solution {
 List<String> res=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        func(0,0,"",n);
return res;
        
    }
    
    private void func(int o,int c,String s,int n){
        //base case
        if(s.length()==n*2){
            res.add(s);
            return ;
        }
        
        if(o<n){
            func(o+1,c,s+"(",n);
        }
       if(c<o){
            func(o,c+1,s+")",n);
        }
        
 
    
    
    }
}