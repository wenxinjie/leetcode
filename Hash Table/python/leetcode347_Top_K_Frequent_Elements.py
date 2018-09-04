# Given a non-empty array of integers, return the k most frequent elements.

# Example 1:

# Input: nums = [1,1,1,2,2,3], k = 2
# Output: [1,2]
# Example 2:

# Input: nums = [1], k = 1
# Output: [1]

class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        map1 = collections.defaultdict(int)
        for n in nums:
        	map1[n] += 1

        map2 = collections.defaultdict(list)
        for i,j in map1.items():
        	map2[j].append(i)

        res = []
        keys = sorted(list(map2.keys()))[::-1]
        for i in keys:
        	res.extend(map2[i])
        	if len(res) == k:
        		break
        return res

# Time: O(n)
# Space: O(n)
# Difficulty: medium       
