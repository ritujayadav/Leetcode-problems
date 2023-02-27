class Solution:
    def findFinalValue(self, nums: List[int], i: int) -> int:
        while i in nums:
            i=i*2
        return i