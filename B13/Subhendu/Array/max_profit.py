class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ## https://leetcode.com/problems/best-time-to-buy-and-sell-stock-2/
        profit = 0

        for i in range(1, len(prices)):
            if prices[i] > prices[i - 1]:
                profit += prices[i] - prices[i - 1]

        return profit



