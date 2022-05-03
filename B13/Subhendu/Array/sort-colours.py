import collections

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        ## https://leetcode.com/problems/sort-colors/
        counter = collections.Counter(nums)

        idx = 0
        while counter[0] > 0:
            nums[idx] = 0
            idx += 1
            counter[0] -= 1

        while counter[1] > 0:
            nums[idx] = 1
            idx += 1
            counter[1] -= 1

        while counter[2] > 0:
            nums[idx] = 2
            idx += 1
            counter[2] -= 1
        return nums