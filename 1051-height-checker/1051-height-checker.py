class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        c=0
        k=sorted(heights)
        for j in range(0,len(heights)):
                       if heights[j]!=k[j]:
                           c=c+1
        return c
