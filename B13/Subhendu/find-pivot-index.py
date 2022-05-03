class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        ## https://leetcode.com/problems/find-pivot-index/
        s = sum(nums)
        agg = 0
        for i in range(0, len(nums)):
            if agg == s - agg - nums[i]:
                return i
            agg += nums[i]

        return -1