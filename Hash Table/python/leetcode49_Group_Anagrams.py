# Given an array of strings, group anagrams together.

# Example:

# Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
# Output:
# [
#   ["ate","eat","tea"],
#   ["nat","tan"],
#   ["bat"]
# ]



class Solution:
    def groupAnagrams1(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d = {}
        for char in strs:
            key = tuple(sorted(char))
            d[key] = d.get(key, []) + [char]
        return list(d.values())
        
    def groupAnagrams2(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        from collections import defaultdict
        dic = collections.defaultdict(list)
        for s in strs: 
            dic["".join(sorted(s))].append(s)
        return list(dic.values())


# Time:O(n)
# Space: O(n)
# Difficulty: medium