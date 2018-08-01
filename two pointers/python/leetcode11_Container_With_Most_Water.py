# Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

# Note: You may not slant the container and n is at least 2.

class Solution:
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        n = len(height)
        point1 = 0
        point2 = n-1
        max_area = 0
        while point2 > point1 :
            area = min(height[point2],height[point1]) * (point2 - point1)
            if area >= max_area:
                max_area = area
                if height[point1] > height[point2]:
                    point2 -= 1
                else:
                    point1 += 1
            else:
                if height[point1] > height[point2]:
                    point2 -= 1
                else:
                    point1 += 1
        return max_area

# Time: O(n)
# Space: O(1)
# Difficulty: medium
