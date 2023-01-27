class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        output=[]
        for i in range(0,len(nums)):
            count=0
            for j in range(0,len(nums)):
                if nums[j] < nums[i]:
                    count=count+1
               
                
                
            output.append(count)
        return output