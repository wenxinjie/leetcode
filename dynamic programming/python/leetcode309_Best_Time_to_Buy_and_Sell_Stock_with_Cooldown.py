# Say you have an array for which the ith element is the price of a given stock on day i.

# Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times) with the following restrictions:

# You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
# After you sell your stock, you cannot buy stock on next day. (ie, cooldown 1 day)
# Example:

# Input: [1,2,3,0,2]
# Output: 3 
# Explanation: transactions = [buy, sell, cooldown, buy, sell]

class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if not prices: return 0
        sell1, sell2 = 0, 0
        buy1 = -1 * prices[0]
        i = 0
        while i < len(prices) - 1:
            i += 1
            tem1, tem2, tem3 = buy1, sell1, sell2
            buy1 = max(tem1, tem3 - prices[i])
            sell1 = max(tem2, tem1 + prices[i])
            sell2 = tem2
            
        return sell1

# Time: O(n) 
# Space: O(1)
# Difficulty: medium     