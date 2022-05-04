class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ## https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
        minprice = prices[0]
        maxprofit = 0

        for i in prices:
            if i < minprice:
                minprice = i
            maxprofit = max(maxprofit, i - minprice)

        return maxprofit