class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int v=0;
     for (int i=0;i<operations.length;i++){
         if(operations[i].charAt(1)=='+'){
         v=v+1;
     } 
       else{
         v=v-1;
     }
    }return v;
}
}
