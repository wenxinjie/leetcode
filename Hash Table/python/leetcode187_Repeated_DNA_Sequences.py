
# All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

# Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

# Example:

# Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"

# Output: ["AAAAACCCCC", "CCCCCAAAAA"]


class Solution(object):
    def findRepeatedDnaSequences(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        if not s or len(s) == 1: return []
        store = set()
        res = set()
        for i in range(len(s) - 9):
            if s[i:i+10] in store:
                res.add(s[i : i + 10])
            store.add(s[i:i+10])
        return list(res)

# Time: O(n)
# Space: O(n^2)
# Difficulty: medium       