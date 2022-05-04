class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        ## https://leetcode.com/problems/move-zeroes/
        idx = 0
        zero = 0
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[idx] = nums[i]
                idx += 1
            else:
                zero += 1

        while zero:
            nums[idx] = 0
            idx += 1
            zero -= 1

        return nums