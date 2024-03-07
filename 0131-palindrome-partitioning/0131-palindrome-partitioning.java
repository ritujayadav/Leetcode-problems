class Solution {
    

public static void exam(int index,List<String> curr,List<List<String>> ans,String s){
if(index==s.length()){
     ans.add(new ArrayList<>(curr));
    return;
}
    for(int i=index;i<s.length();i++){
        if(pali(s,index,i)){
              curr.add(s.substring(index,i+1));
            exam(i+1,curr,ans,s);
        curr.remove(curr.size()-1);   
    }
    }
}
    
    public static boolean pali(String s,int i,int end){
        
        while(i<end){
            if(s.charAt(i++)!=s.charAt(end--)){
                return false;
            }
             
            }
        return true;
        } 
    public List<List<String>> partition(String s) {
    List<String> curr=new ArrayList<>();
    List<List<String>> ans=new ArrayList<>();
    exam(0,curr,ans,s);
        return ans;
    }
}