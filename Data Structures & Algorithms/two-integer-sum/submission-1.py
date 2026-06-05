class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        L={}
        for i in range(len(nums)):
            X=target-nums[i]
            if X in L:
                return [L[X],i]
            L[nums[i]]=i
        return False