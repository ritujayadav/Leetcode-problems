class Solution:
    def minimumSum(self, num: int) -> int:
        p=list(str(num))
        p.sort()
        return(int(p[0]+p[2])+int(p[1]+p[3]))
