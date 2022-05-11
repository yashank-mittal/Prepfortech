from collections import defaultdict

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        ## https://leetcode.com/problems/subarray-sum-equals-k/
        count_dict = defaultdict(int)
        s = 0
        ans = 0
        count_dict[0] = 1
        for i in nums:
            s += i
            if count_dict.get(s - k):
                ans += count_dict.get(s - k)

            count_dict[s] += 1
        return ans
