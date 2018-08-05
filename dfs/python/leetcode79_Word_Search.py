
# The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.

# Example:

# board =
# [
#   ['A','B','C','E'],
#   ['S','F','C','S'],
#   ['A','D','E','E']
# ]

# Given word = "ABCCED", return true.
# Given word = "SEE", return true.
# Given word = "ABCB", return false.


class Solution(object):
    def exist(self, board, word):
        """
        :type board: List[List[str]]
        :type word: str
        :rtype: bool
        """
        m,n = len(board) , len(board[0])
        for i in range(m):
            for j in range(n):
                if self.helper(i,j,board, word):
                    return True
        return False
    
    def helper(self, i, j, board, word):
        if len(word) == 0: return True
        elif i < 0 or i >= len(board) or j < 0 or j >= len(board[0]) or board[i][j] != word[0]:
            return False
        else:
            tem = board[i][j]
            board[i][j] = 0
            if  self.helper(i+1,j,board,word[1:]) or self.helper(i-1,j,board,word[1:]) or self.helper(i,j-1,board,word[1:]) or self.helper(i,j+1,board,word[1:]):
                board[i][j] = tem
                return True
            else: 
                board[i][j] = tem
                return False

# Time: O(m * n)
# Space: O(1)
# Difficulty: medium