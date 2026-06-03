class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_vol = -float('inf')
        current_vol = 0
        # for i in range(len(height)-1):
        #     for j in range(i+1, len(height)):
        #         current_vol = (j-i)*min(height[i],height[j])
        #         if current_vol>Max_vol:
        #             Max_vol = current_vol
        # return Max_vol
        left = 0
        right = len(height)-1
        while left<right:
            current_vol = (right-left)*min(height[left],height[right])
            max_vol = max(current_vol,max_vol)
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
        return max_vol

         