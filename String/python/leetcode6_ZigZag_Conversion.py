# The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

# P   A   H   N
# A P L S I I G
# Y   I   R
# And then read line by line: "PAHNAPLSIIGYIR"
# Write the code that will take a string and make this conversion given a number of rows:
# string convert(string s, int numRows);
# Example 1:
# Input: s = "PAYPALISHIRING", numRows = 3
# Output: "PAHNAPLSIIGYIR"


class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows >= len(s) or numRows == 1: return s
        res = ["" for _ in range(numRows)]
        row, direction = 0, -1
        for char in s:
            res[row] += char
            if row == 0 or row == numRows - 1:
                direction *= -1      
            row += direction
        return "".join(res)

# time:O(n)
# space:O(n)
# difficulty: medium