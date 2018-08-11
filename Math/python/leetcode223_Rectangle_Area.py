
# Find the total area covered by two rectilinear rectangles in a 2D plane.

# Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.

# Rectangle Area
# Input: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2
# Output: 45

class Solution(object):
    def computeArea(self, A, B, C, D, E, F, G, H):
        """
        :type A: int
        :type B: int
        :type C: int
        :type D: int
        :type E: int
        :type F: int
        :type G: int
        :type H: int
        :rtype: int
        """
        s1 = abs(A - C) * abs(B - D)
        s2 = abs(E - G) * abs(F - H)
        width = min(C, G) - max(A , E)
        height = min(D,H) - max(B, F)
        if width <= 0 or height <= 0:
            return s1 + s2
        else:
            return s1 + s2 - width * height

# Time: O(1)
# Space: O(1)
# Difficulty: medium