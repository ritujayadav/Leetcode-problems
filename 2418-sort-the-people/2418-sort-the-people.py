class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        r = []
        for i in range(len(names)):
            r.append([heights[i],names[i]])
        r= sorted(r,reverse=True)
        return [name for height,name in r]