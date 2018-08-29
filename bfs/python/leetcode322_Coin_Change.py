# You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

# Example 1:

# Input: coins = [1, 2, 5], amount = 11
# Output: 3 
# Explanation: 11 = 5 + 5 + 1
# Example 2:

# Input: coins = [2], amount = 3
# Output: -1

class Solution(object):
    def coinChange(self, coins, amount):
        """
        :type coins: List[int]
        :type amount: int
        :rtype: int
        """
        # BFS search
        if amount == 0:
            return  0 
        value1 = [0]
        value2 = []
        count = 0
        visited = [0] * (amount + 1)
        visited[0] = 1
        while value1:
            count += 1
            for value in value1:
                for coin in coins:
                    v = value + coin
                    if v == amount:
                        return count
                    elif v > amount:
                        continue
                    elif visited[v] == 0:
                        visited[v]  = 1
                        value2.append(v) 
            value1, value2 = value2, []
        return -1

    def coinChange(self, coins, amount):

    	# dp 
        MAX = float('inf')
        dp = [0] + [MAX] * amount

        for i in xrange(1, amount + 1):
            dp[i] = min([dp[i - c] if i - c >= 0 else MAX for c in coins]) + 1

        return [dp[amount], -1][dp[amount] == MAX]

        