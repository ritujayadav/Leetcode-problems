class Solution:
    def isPowerOfTwo(self, n: int) -> bool:

        for i in range(1000):

            answer = pow(2,i)

            if (answer == n):
                return True
        return False        
        
        