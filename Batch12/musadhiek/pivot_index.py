# Given an array of integers nums, calculate the pivot index of this array.

# Return the leftmost pivot index. If no such index exists, return -1.

# solution 
class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        total = sum(nums)
        left_sum = 0
        
        for idx in range(0,len(nums)):
            total -= nums[idx]
            if idx != 0:
                left_sum += nums[idx-1]
            if total == left_sum:
                return idx
                
                
        return -1