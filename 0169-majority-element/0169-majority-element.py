class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        k=len(nums)/2
        z=set(nums)
        for i in z:
            if nums.count(i)>k:
                return i

        