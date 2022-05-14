class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ## https://leetcode.com/problems/3sum/
        nums.sort()
        ans = []
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            l = i + 1
            r = len(nums) - 1

            while l < r:
                s = nums[i] + nums[l] + nums[r]

                if s == 0:
                    ans.append([nums[i], nums[l], nums[r]])
                    r -= 1
                    l += 1
                    while l < r and nums[r] == nums[r + 1]:
                        r -= 1
                    while l < r and nums[l] == nums[l - 1]:
                        l += 1
                elif s > 0:
                    r -= 1
                else:
                    l += 1
        return ans