class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        s=0
        k=1
        while(n>0):
            p=n%10
            s=s+p
            k=k*p
            n=n//10
        return int(k-s)
