class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack=[]
        result=[0]*len(temperatures)

        for i, val in enumerate(temperatures):
            while stack and val>stack[-1][0]:
                stackT, stackI = stack.pop()
                result[stackI]=i - stackI
            stack.append((val,i))
        return result