class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        ## https://leetcode.com/problems/3sum-closest/
        nums.sort()
        min_diff = float('inf')
        min_sum = 0
        for i in range(len(nums) - 2):
            l = i + 1
            r = len(nums) - 1

            while l < r:
                s = nums[i] + nums[l] + nums[r]
                diff = abs(target - s)
                if diff < min_diff:
                    min_diff = diff
                    min_sum = s

                if s == target:
                    break
                elif s < target:
                    l += 1
                elif s > target:
                    r -= 1
        return min_sum