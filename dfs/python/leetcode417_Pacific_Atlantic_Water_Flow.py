
# Given an m x n matrix of non-negative integers representing the height of each unit cell in a continent, the "Pacific ocean" touches the left and top edges of the matrix and the "Atlantic ocean" touches the right and bottom edges.

# Water can only flow in four directions (up, down, left, or right) from a cell to another one with height equal or lower.

# Find the list of grid coordinates where water can flow to both the Pacific and Atlantic ocean.

# Note:
# The order of returned grid coordinates does not matter.
# Both m and n are less than 150.

# Given the following 5x5 matrix:

#   Pacific ~   ~   ~   ~   ~ 
#        ~  1   2   2   3  (5) *
#        ~  3   2   3  (4) (4) *
#        ~  2   4  (5)  3   1  *
#        ~ (6) (7)  1   4   5  *
#        ~ (5)  1   1   2   4  *
#           *   *   *   *   * Atlantic

# Return:

# [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (positions with parentheses in above matrix).

class Solution(object):
    def pacificAtlantic(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[List[int]]
        """
        if not matrix or not matrix[0]: return matrix 
        m, n =  len(matrix), len(matrix[0])
        direction = [[0, 1],[0, -1], [-1,0],[1,0]]
        
        def Pacific(mat):
            visited = set()
            for i in range(m):
                dfs(mat, i, 0, visited)
            for j in range(n):
                dfs(mat, 0, j, visited)
            return visited
        
        def Atlantic(mat):
            visited = set()
            for i in reversed(range(m)):
                dfs(mat, i, n-1, visited)
            for j in reversed(range(n)):
                dfs(mat, m-1, j, visited)
            return visited
        
        def dfs(mat, row, col, visited):
            if (row, col) in visited:
                return 
            visited.add((row,col))
            
            for dire in direction:
                r,c = row + dire[0], col + dire[1]
                if 0<=r<m and 0<=c <n and matrix[r][c] >= matrix[row][col]:
                    dfs(mat, r, c, visited)
        pset = Pacific(matrix)
        aset = Atlantic(matrix)
        return [list(i) for i in (set(aset)&set(pset))] 

# Time: O(n * m)
# Space: O(n * m)
# Difficulty: medium



