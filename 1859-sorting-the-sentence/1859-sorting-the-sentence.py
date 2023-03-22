class Solution:
    def sortSentence(self, s: str) -> str:
        
        d = s.split(' ')
        s = ['']*len(d) 
         
        for i in d:
            s[int(i[-1])-1] = i[:-1]
            
        return ' '.join(s)