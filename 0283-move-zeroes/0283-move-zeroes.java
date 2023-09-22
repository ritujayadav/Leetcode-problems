class Solution {
    public void moveZeroes(int[] nums) {
       ArrayList<Integer> t= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                t.add(nums[i]);
            }
        }
     int nz=t.size();
          for (int i = 0; i < nz; i++) {
            nums[i] = t.get(i);
        }
        for (int i = nz; i < nums.length; i++) {
            nums[i]=0;
        }
    }
}