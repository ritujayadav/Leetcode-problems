class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int k=nums.length/3;
        ArrayList <Integer>x=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int s=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    s+=1;
                }
            }
            if(s==k){
                x.add(nums[i]);
            }
        }
        return x;
    }
}