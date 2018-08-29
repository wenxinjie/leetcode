# Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.

# Example 1:

# Input: ["abcw","baz","foo","bar","xtfn","abcdef"]
# Output: 16 
# Explanation: The two words can be "abcw", "xtfn".
# Example 2:

# Input: ["a","ab","abc","d","cd","bcd","abcd"]
# Output: 4 
# Explanation: The two words can be "ab", "cd".
# Example 3:

# Input: ["a","aa","aaa","aaaa"]
# Output: 0 
# Explanation: No such pair of words.

class Solution(object):
    def maxProduct(self, words):
        """
        :type words: List[str]
        :rtype: int
        """
        res = 0
        for i in range(len(words)):
            for j in range(i + 1, len(words)):
                if set(words[i]) & set(words[j]) == set():
                    res = max(res, len(words[i]) * len(words[j]))
        return res
