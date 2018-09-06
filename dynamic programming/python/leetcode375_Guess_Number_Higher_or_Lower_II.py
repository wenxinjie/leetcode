# We are playing the Guess Game. The game is as follows:

# I pick a number from 1 to n. You have to guess which number I picked.

# Every time you guess wrong, I'll tell you whether the number I picked is higher or lower.

# However, when you guess a particular number x, and you guess wrong, you pay $x. You win the game when you guess the number I picked.

# Example:

# n = 10, I pick 8.

# First round:  You guess 5, I tell you that it's higher. You pay $5.
# Second round: You guess 7, I tell you that it's higher. You pay $7.
# Third round:  You guess 9, I tell you that it's lower. You pay $9.

# Game over. 8 is the number I picked.

# You end up paying $5 + $7 + $9 = $21


class Solution(object):
    def getMoneyAmount(self, n):
        """
        :type n: int
        :rtype: int
        """
        table = [[0 for _ in range(n+1)] for _ in range(n+1)]
        return self.dp(table, 1, n)
    
    def dp(self, table, s, e):
        if s >= e: return 0
        if table[s][e] != 0: return table[s][e]
        res = float("inf")
        for i in range(s, e+1):
            tem = i + max(self.dp(table, s, i-1) , self.dp(table, i+1, e))
            res = min(res, tem)
        table[s][e] = res
        return res

# Time: O(n^3)
# Space: O(n^2)
# Difficulty: mediu