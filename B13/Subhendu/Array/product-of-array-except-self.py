class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        left = [None] * n
        right = [None] * n
        r = len(nums) - 1
        acc_l = acc_r = 1
        for l in range(n):
            left[l] = acc_l
            right[r] = acc_r
            acc_l *= nums[l]
            acc_r *= nums[r]
            r -= 1

        ans = []
        for i in range(len(nums)):
            ans.append(left[i] * right[i])
        return ans
