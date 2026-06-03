class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left_ptr= 0
        
        for right_ptr in range(len(nums)):
            if nums[right_ptr] !=0:
                nums[left_ptr],nums[right_ptr] =nums[right_ptr],nums[left_ptr]
                left_ptr+=1

            
            
