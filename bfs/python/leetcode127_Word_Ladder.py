# iven two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

# Only one letter can be changed at a time.
# Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
# Note:

# Return 0 if there is no such transformation sequence.
# All words have the same length.
# All words contain only lowercase alphabetic characters.
# You may assume no duplicates in the word list.
# You may assume beginWord and endWord are non-empty and are not the same.
# Example 1:

# Input:
# beginWord = "hit",
# endWord = "cog",
# wordList = ["hot","dot","dog","lot","log","cog"]

# Output: 5

# Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
# return its length 5.

class Solution:
    def ladderLength(self, beginWord, endWord, wordList):
        """
        :type beginWord: str
        :type endWord: str
        :type wordList: List[str]
        :rtype: int
        """
        stack = [(beginWord, 1)]
        wordList = set(wordList)
        if beginWord in wordList:
            wordList.remove(beginWord)
        if endWord not in wordList:
            return 0
        from collections import deque
        stack = deque(stack)
        while stack:
            word, length = stack.popleft()
            if word == endWord:
                return length
            for i in range(len(word)):
                for c in "abcdefghigklmnopqrstuvwxyz":
                    nextword = word[:i] + c + word[i+1:]
                    if nextword in wordList:
                        wordList.remove(nextword)
                        stack.append((nextword,length+1))
        return 0
        
# Time: O(m + n)
# Space: O(n)
# Difficulty: medium
