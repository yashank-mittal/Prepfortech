import collections

class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        ## https://leetcode.com/problems/max-number-of-k-sum-pairs/

        used_nums = collections.defaultdict(int)
        count = 0
        for i, j in enumerate(nums):
            if used_nums.get(k-j):
                count += 1
                used_nums[(k-j)] -= 1
            else:
                used_nums[j]+=1
        return count