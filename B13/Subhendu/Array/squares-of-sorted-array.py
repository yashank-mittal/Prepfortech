class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        ## https://leetcode.com/problems/squares-of-a-sorted-array/

        n = len(nums)
        ans = [None] * n

        i, j, k = 0, n - 1, n - 1

        for _ in range(n):
            if nums[i] ** 2 > nums[j] ** 2:
                ans[k] = nums[i] ** 2
                i += 1
            else:
                ans[k] = nums[j] ** 2
                j -= 1
            k -= 1

        return ans