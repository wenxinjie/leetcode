# Write a function that takes a string as input and reverse only the vowels of a string.

# Example 1:

# Input: "hello"
# Output: "holle"
# Example 2:

# Input: "leetcode"
# Output: "leotcede"

class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        dic = {"a", "e", "i", "o", "u", "A", "E","I","O","U"}
        string = list(s)
        i,j = 0, len(string) - 1
        
        while i < j:
            while i < j and string[i] not in dic:
                i += 1
            while i < j and string[j] not in dic:
                j -= 1
            string[i], string[j] = string[j], string[i]
            i += 1
            j -= 1
        return "".join(string)


# Time: O(n)
# Space: O(n)
# Difficulty: easy