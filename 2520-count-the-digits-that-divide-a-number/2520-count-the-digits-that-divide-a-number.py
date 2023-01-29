class Solution:
    def countDigits(self, num: int) -> int:
        lists = list(str(num))
      
        count = 0
        for i in range(0,len(lists)):
            if num % int(lists[i]) == 0:
                count += 1
        return count

        
        
        