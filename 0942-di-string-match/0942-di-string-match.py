class Solution:
    def diStringMatch(self, s: str) -> List[int]:
        sum=0
        l=len(s)
       
        k=[]
        for i in s:
            if i=="I":
                k.append(sum)
                sum=sum+1
            else:
                k.append(l)
                l=l-1
        k.append(sum)
        return k
