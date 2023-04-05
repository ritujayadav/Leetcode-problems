class Solution:
    def countPrimes(self, n: int) -> int:
       
        p = [True] * n
        
        if n < 2:
            return 0
        
        p[0], p[1] = False, False
        
        i = 2
        while i*i < n:
            if p[i] == True:
                for j in range(i*i, n, i):
                    p[j] = False
                    
            i += 1
            
        return p.count(True)