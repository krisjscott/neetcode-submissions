class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashi={}
        for i in nums:
            if i in hashi:
                return True
            else:
                hashi[i]=True
        return False
        