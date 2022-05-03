class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ## https://leetcode.com/problems/two-sum/

        used_num = dict()

        for i in range(len(nums)):
            if (target - nums[i]) in used_num:
                return [used_num[target - nums[i]], i]
            used_num[nums[i]] = i