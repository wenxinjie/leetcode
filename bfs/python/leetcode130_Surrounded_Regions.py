# Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.

# A region is captured by flipping all 'O's into 'X's in that surrounded region.

# Example:

# X X X X
# X O O X
# X X O X
# X O X X
# After running your function, the board should be:

# X X X X
# X X X X
# X X X X
# X O X X

class Solution:
    def solve(self, board):
        """
        :type board: List[List[str]]
        :rtype: void Do not return anything, modify board in-place instead.
        """
        if  board:
            m, n = len(board), len(board[0])
            queue = []
            for i in range(m):
                for j in range(n):
                    if (i in [0, m-1] or j in [0, n-1] ) and board[i][j] == "O":
                        queue.append((i,j))

            while queue:
                i,j = queue.pop()
                if 0 <= i <= m-1 and 0 <=j <= n-1 and board[i][j] == "O":
                    board[i][j] = "A"
                    # queue.extend(((i+1,j), (i-1, j), (i, j+1), (i, j-1)))
                    queue.append((i-1,j))
                    queue.append((i+1,j))
                    queue.append((i,j-1))
                    queue.append((i,j+1))

            for i in range(m):
                for j in range(n):
                    if board[i][j] == "A":
                        board[i][j] = "O"
                    elif board[i][j] == "O":
                        board[i][j] = "X"

# Time: O(m*n)
# Space: O(1)
# Difficulty: medium
