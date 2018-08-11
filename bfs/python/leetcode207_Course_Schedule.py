# There are a total of n courses you have to take, labeled from 0 to n-1.

# Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

# Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

# Example 1:

# Input: 2, [[1,0]] 
# Output: true
# Explanation: There are a total of 2 courses to take. 
#              To take course 1 you should have finished course 0. So it is possible.
# Example 2:

# Input: 2, [[1,0],[0,1]]
# Output: false
# Explanation: There are a total of 2 courses to take. 
#              To take course 1 you should have finished course 0, and to take course 0 you should
#              also have finished course 1. So it is impossible.


class Solution(object):
    def canFinish(self, numCourses, prerequisites):
        """
        :type numCourses: int
        :type prerequisites: List[List[int]]
        :rtype: bool
        """
        relation = {}
        degree = []
        queue = []
        
        for i in range(numCourses):
            relation[i] = []
            degree.append(0)
        
        for pre in prerequisites:
            relation[pre[1]].append(pre[0])
            degree[pre[0]] += 1
        
        for i in range(numCourses):
            if degree[i] == 0:
                queue.append(i)
        while queue:
            course = queue.pop()
            for target in relation[course]:
                degree[target] -= 1
                if degree[target] == 0:
                    queue.append(target)
        for i in range(numCourses):
            if degree[i] != 0:
                return False
        return True

# Time: O(m+n)
# Space: O(n+m)
# Difficulty: medium