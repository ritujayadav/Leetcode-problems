class Solution:
    def findLucky(self, arr: List[int]) -> int:
        a=Counter(arr)
        x=[]
        for i in arr:
            if i==a[i]:
                x.append(i)
        if x:
            return max(x)
        return -1
