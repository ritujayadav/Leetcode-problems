class Solution(object):
    def firstUniqChar(self, s):

        for i in s:
            if s.find(i)==s.rfind(i):
                return s.find(i)
        return -1
        