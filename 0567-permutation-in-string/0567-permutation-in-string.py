 
class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        n1, n2 = len(s1), len(s2)
        if n1 > n2 :
            return False
        c1 = collections.Counter(s1)
        c2 = collections.Counter(s2[:n1])
        if c1 == c2:
            return True
        for i in range(n2 - n1):
            c2[s2[i]] -= 1
            c2[s2[i + n1]] += 1
            if c2 == c1:
                return True
        return False