"""
Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
"""

class Solution:
    def subsets(self, nums):
        result = []
        track = []
        def backtrack(nums,start =0):
            result.append(track[:])
            for idx in range(start,len(nums)):
                track.append(nums[idx])
                backtrack(nums,idx+1)
                track.remove(nums[idx])
        backtrack(nums,0)
        return result
#method2
class Solution:
    def subsets(self, nums,idx=None ):
        if idx == None:
            idx = len(nums)-1
        if idx <0:
            return [[]]
        ele = nums[idx]
        temp_set= self.subsets(nums,idx-1)
        for idx in range(len(temp_set)):
            current_set = temp_set[idx]
            temp_set.append(current_set+[ele])
            
        return temp_set