class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        k=[]
        for i in range(0,len(nums)):
            k.insert(index[i],nums[i])
        return k

    
 