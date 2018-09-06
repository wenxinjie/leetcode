# Given a collection of intervals, find the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

# Note:
# You may assume the interval's end point is always bigger than its start point.
# Intervals like [1,2] and [2,3] have borders "touching" but they don't overlap each other.
# Example 1:
# Input: [ [1,2], [2,3], [3,4], [1,3] ]

# Output: 1

# Explanation: [1,3] can be removed and the rest of intervals are non-overlapping.

# Definition for an interval.
# class Interval:
#     def __init__(self, s=0, e=0):
#         self.start = s
#         self.end = e

class Solution:
    def eraseOverlapIntervals(self, intervals):
        """
        :type intervals: List[Interval]
        :rtype: int
        """
        intervals.sort(key = lambda i: i.end)
        end = -float("inf")
        res = 0
        for i in intervals:
            if i.start >= end:
                end = i.end
            else:
                res += 1
        return res

# Time: O(nlog(n))
# Space: O(n)
# Difficulty: medium      