class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        a=[]
        for i in range(0,len(nums)//2):
            f=nums[2*i]
            v=nums[2*i+1]
            a.extend(f*[v])
        return a
 