# Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

# Example 1:

# Input: n = 12
# Output: 3 
# Explanation: 12 = 4 + 4 + 4.
# Example 2:

# Input: n = 13
# Output: 2
# Explanation: 13 = 4 + 9.


class Solution:
    def numSquares(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n <= 0: return 0
        if n == 1: return 1
        pool = {x * x : 1 for x in range(1, int(pow(n, 0.5)))}
        visited = [0] * (n + 1)
        visited[0] = 1
        queue = collections.deque()
        queue.append([0, 0])
        while queue:
            value, cnt = queue.popleft()
            for i in pool.keys():
                if value + i == n:
                    return cnt + 1
                elif value + i > n:
                    continue
                else:
                    if visited[value + i] == 0:
                        visited[value + i] = 1
                        queue.append([value + i, cnt + 1]

# Time: O(log(n))
# Space: O(n)
# Difficulty: medium                