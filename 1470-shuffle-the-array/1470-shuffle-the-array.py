
class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        
        d=[]
        for i in range(n):
            d.append(nums[i])
            d.append(nums[i+n])
        return d