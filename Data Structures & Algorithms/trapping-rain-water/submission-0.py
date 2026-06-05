class Solution:
    def trap(self, height: List[int]) -> int:
        l,r=0,len(height)-1
        res=0
        leftmax=height[l]
        rightmax=height[r]
        while l<r:
            if leftmax<rightmax:
                l+=1
                leftmax=max(height[l],leftmax)
                res+=leftmax-height[l]
            else:
                r-=1
                rightmax=max(height[r],rightmax)
                res+=rightmax-height[r]
        return res

        