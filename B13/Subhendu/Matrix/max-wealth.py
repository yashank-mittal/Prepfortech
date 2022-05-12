class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        ## https://leetcode.com/problems/richest-customer-wealth/
        max_wealth = 0
        for i in accounts:
            max_wealth = max(max_wealth, sum(i))
        return max_wealth