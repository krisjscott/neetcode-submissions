class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hash={}
        freq = [[]for i in range(len(nums)+1)]

        for n in nums:
            hash[n] = hash.get(n,0) + 1
        for n, c in hash.items():
            freq[c].append(n)
        res=[]
        for n in range(len(freq)-1,0,-1):
            for i in freq[n]:
                res.append(i)
                if len(res)==k:
                    return res

        