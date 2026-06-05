class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hashing=set()
        for i in nums:
            if i in hashing:
                return True
            hashing.add(i)
            
        return False


