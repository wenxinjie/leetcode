# There are a total of n courses you have to take, labeled from 0 to n-1.

# Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]

# Given the total number of courses and a list of prerequisite pairs, return the ordering of courses you should take to finish all courses.

# There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all courses, return an empty array.

# Example 1:

# Input: 2, [[1,0]] 
# Output: [0,1]
# Explanation: There are a total of 2 courses to take. To take course 1 you should have finished   
#              course 0. So the correct course order is [0,1] .


class Solution(object):
    def findOrder(self, numCourses, prerequisites):
        """
        :type numCourses: int
        :type prerequisites: List[List[int]]
        :rtype: List[int]
        """
        graph = [[] for _ in range(numCourses)]
        indegree = [0  for _ in range(numCourses)]
        
        for pre in prerequisites:
            graph[pre[1]].append(pre[0])
            indegree[pre[0]] += 1
        queue = []
        res = []
        for i in range(numCourses):
            if indegree[i] == 0:
                queue.append(i)
                res.append(i)
        while queue:
            course = queue.pop()
            for tem in graph[course]:
                indegree[tem] -= 1
                if indegree[tem] == 0:
                    queue.append(tem)
                    res.append(tem)
        for i in range(numCourses):
            if indegree[i] != 0:
                return []
        return res

# Time: O(m+n)
# Space: O(m+n)
# Difficulty: medium               






