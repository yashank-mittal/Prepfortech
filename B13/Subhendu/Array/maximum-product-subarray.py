class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n = len(nums)
        maxprod = minprod = result = nums[0]
        for i in nums[1:]:
            if i < 0:
                minprod, maxprod = maxprod, minprod

            minprod = min(i, minprod * i)
            maxprod = max(i, maxprod * i)
            result = max(result, maxprod)
        return result