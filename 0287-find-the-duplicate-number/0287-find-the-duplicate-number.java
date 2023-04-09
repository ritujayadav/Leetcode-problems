class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> x=new HashSet();
        for(int a:nums){
if(x.contains(a)){
    return a;
}else{
    x.add(a);
}
        
    }return -1;
}

}