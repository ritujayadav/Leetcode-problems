class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        x = []
        for i in range(0,len(nums1)):
            
            for j in range(0,len(nums2)):
            
                f= 1
                v=0
                if nums1[i]==nums2[j]:
                    v = nums2[j]
        
                    for k in range(j+1,len(nums2)):
                        if nums2[k]>v:
                            x.append(nums2[k])
                            f= 0
                            break
                    
                    if f== 1:
                        x.append(-1)
        return x