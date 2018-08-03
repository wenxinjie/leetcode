# The count-and-say sequence is the sequence of integers with the first five terms as following:

# 1.     1
# 2.     11
# 3.     21
# 4.     1211
# 5.     111221

# 1 is read off as "one 1" or 11.
# 11 is read off as "two 1s" or 21.
# 21 is read off as "one 2, then one 1" or 1211.
# Given an integer n, generate the nth term of the count-and-say sequence.

# Note: Each term of the sequence of integers will be represented as a string.

# Example 1:

# Input: 1
# Output: "1"
# Example 2:

# Input: 4
# Output: "1211"


class Solution:
    def countAndSay(self, n):
        """
        :type n: int
        :rtype: str
        """
        s = "1"
        for i in range(n - 1):
            c, cnt, tem = s[0], 0, ""
            
            for l in s:
                if l == c:
                    cnt += 1
                else:
                    tem += str(cnt) + c
                    c = l
                    cnt = 1
            tem += str(cnt) + c
            s = tem
        return s
            
# Time: O(n)
# Space: O(1)
# Difficulty: easy