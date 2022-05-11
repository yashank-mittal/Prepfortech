class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        ## https://leetcode.com/problems/next-permutation/
        i = len(nums) - 2

        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1

        if i >= 0:
            j = len(nums) - 1
            while j < i and nums[i] >= nums[j]:
                j -= 1

            nums[i], nums[j] = nums[j], nums[i]

        start = i + 1
        end = len(nums) - 1

        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1
        return nums