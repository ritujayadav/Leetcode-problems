class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        
        string = '' 
        
        for i in digits:
            string =string+ str(i)
            
        integer= int(string)+1 
        
        
        return [int(x) for x in str(integer)]
        
