# Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

# Each row must contain the digits 1-9 without repetition.
# Each column must contain the digits 1-9 without repetition.
# Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.

# A partially filled sudoku which is valid.

# The Sudoku board could be partially filled, where empty cells are filled with the character '.'.


class Solution(object):
    def isValidSudoku(self, board):
        """
        :type board: List[List[str]]
        :rtype: bool
        """
        m,n = len(board), len(board[0])
        for i in range(m):
            row, col, cube = set(), set(), set()
            for j in range(n):
                
                if board[i][j] != '.':
                    if board[i][j] in row:
                        return False
                    else: row.add(board[i][j])
                
                if board[j][i] != '.':
                    if board[j][i] in col:
                        return False
                    else: col.add(board[j][i])
                
                rowInd = (i // 3) * 3
                colInd = (i % 3) * 3
                
                if board[rowInd + j // 3][colInd + j % 3] != '.':
                    if board[rowInd + j // 3][colInd + j % 3] in cube:
                        return False
                    else: cube.add(board[rowInd + j // 3][colInd + j % 3])
        return True

# Time: O(n^2)
# Space: O(n^2)
# Difficulty: medium