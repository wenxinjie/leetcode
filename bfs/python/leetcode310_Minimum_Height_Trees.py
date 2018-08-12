# For a undirected graph with tree characteristics, we can choose any node as the root. The result graph is then a rooted tree. Among all possible rooted trees, those with minimum height are called minimum height trees (MHTs). Given such a graph, write a function to find all the MHTs and return a list of their root labels.

# Format
# The graph contains n nodes which are labeled from 0 to n - 1. You will be given the number n and a list of undirected edges (each edge is a pair of labels).

# You can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.

# Example 1 :

# Input: n = 4, edges = [[1, 0], [1, 2], [1, 3]]

#         0
#         |
#         1
#        / \
#       2   3 

# Output: [1]

class Solution:
    def findMinHeightTrees(self, n, edges):
        """
        :type n: int
        :type edges: List[List[int]]
        :rtype: List[int]
        """
        if not edges: return [0] if n == 1 else []
        
        graph = [set() for _ in range(n)]
        
        for i,j in edges:
            graph[i].add(j)
            graph[j].add(i)
        
        leaves = [ i for i in range(n) if len(graph[i]) == 1]
        while n > 2 :
            n -= len(leaves)
            new_leaves = []
            for leave in leaves:
                tem = graph[leave].pop()
                graph[tem].remove(leave)
                if len(graph[tem]) == 1:
                    new_leaves.append(tem)
            leaves = new_leaves
            
        return leaves

# Time: O(n) 
# Space: O(n)
# Difficulty: medium