class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int[] a=new int[l/2];
        int[] b=new int[l/2];
        int a1=0,b1=0;
        for(int i=0;i<l;i++){
            if(nums[i]>=0){
                a[a1++]=nums[i];
            }
            else {
                b[b1++]=nums[i];
            }
        }
        for(int i=0;i<l/2;i++){
            nums[2*i]=a[i];
            nums[2*i+1]=b[i];
        }
        return nums;
    }
}
