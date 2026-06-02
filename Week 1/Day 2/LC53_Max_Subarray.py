class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        #Brute Force
        # max_sum =-float(inf)
        # current_sum = 0
        # for i in range(len(nums)):
        #     current_sum=0
        #     for j in range(i,len(nums)):
        #         current_sum+= nums[j]
                
        #         max_sum = max(max_sum,current_sum)
        # return max_sum
        max_sum = -float('inf')
        current_sum =0
        for i in range(0,len(nums)):
            current_sum += nums[i]
            
            if current_sum> max_sum:
                max_sum = current_sum
            if current_sum<0:
                current_sum =  0
        return max_sum

        
        
        
        