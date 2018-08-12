
# According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

# Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

# Any live cell with fewer than two live neighbors dies, as if caused by under-population.
# Any live cell with two or three live neighbors lives on to the next generation.
# Any live cell with more than three live neighbors dies, as if by over-population..
# Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
# Write a function to compute the next state (after one update) of the board given its current state. The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously.

# Example:

# Input: 
# [
#   [0,1,0],
#   [0,0,1],
#   [1,1,1],
#   [0,0,0]
# ]
# Output: 
# [
#   [0,0,0],
#   [1,0,1],
#   [0,1,1],
#   [0,1,0]
# ]

class Solution(object):
    def gameOfLife(self, board):
        """
        :type board: List[List[int]]
        :rtype: void Do not return anything, modify board in-place instead.
        """
        if not board or len(board) == 0: return 
        
        m, n = len(board), len(board[0])
        
        for i in range(m):
            for j in range(n):
                live = self.countLive(board, m, n, i, j)
                
                if board[i][j] == 1 and live in (2,3):
                    board[i][j] = 3
                if board[i][j] == 0 and live == 3:
                    board[i][j] = 2
        
        for i in range(m):
            for j in range(n):
                board[i][j] = board[i][j] >> 1
    
    
    
    def countLive(self, board, m, n, i, j):
        live = 0
        for x in range(max(i-1, 0), min(i+2, m)):
            for y in range(max(j-1,0), min(j+2, n)):
                live += board[x][y] & 1
        live -= board[i][j] & 
        return live

# Time: O(n^2)
# Space: O(1)
# Difficulty: medium





