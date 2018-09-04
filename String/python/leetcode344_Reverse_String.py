# Write a function that takes a string as input and returns the string reversed.

# Example 1:

# Input: "hello"
# Output: "olleh"
# Example 2:

# Input: "A man, a plan, a canal: Panama"
# Output: "amanaP :lanac a ,nalp a ,nam A"

class Solution(object):
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        string = list(s)
        for i in range(0, len(string)/2):
            
            tmp = string[len(string)-i-1]
            string[len(string)-i-1] = string[i]
            string[i] = tmp
            
        return "".join(string)

# Time: O(n)
# Space: O(n)
# Difficulty: easy