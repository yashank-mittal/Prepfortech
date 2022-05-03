from collections import defaultdict

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        ## https://leetcode.com/problems/majority-element/
        counter = defaultdict(int)
        n = len(nums)
        for i in nums:
            counter[i] += 1

        max_count = -1
        max_item = -1
        for i, j in counter.items():
            if j > max_count:
                max_count = j
                max_item = i
        return max_item