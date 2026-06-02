class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        d = {}
        for _ in nums:
            if _ in d.keys():
                d[_]+=1
            else:
                d[_] = 1
        for i,j in d.items():
            if j>1:
                return True
        return False