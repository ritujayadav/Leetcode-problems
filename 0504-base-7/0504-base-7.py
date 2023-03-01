import numpy as x
class Solution(object):
    def convertToBase7(self, num):
        return x.base_repr(num, base=7)
        