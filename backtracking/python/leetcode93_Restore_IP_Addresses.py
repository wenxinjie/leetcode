
# Given a string containing only digits, restore it by returning all possible valid IP address combinations.

# Example:

# Input: "25525511135"
# Output: ["255.255.11.135", "255.255.111.35"]





class Solution(object):
    def restoreIpAddresses(self, s):
        """
        :type s: str
        :rtype: List[str]
        """
        res = []
        self.helper(res, "", s, 0, 0)
        return res
    def helper(self, res, cur, s, index, count):
        if count > 4:return 
        if count == 4  and index == len(s):
            res.append(cur + "")
            return 
        for i in range(1,4):
            if index + i > len(s): break
            tem = s[index:index + i]
            if (tem[0] == "0" and len(tem)>1) or (int(tem) > 255): continue
            self.helper(res, cur + tem + ("" if count == 3 else "."), s, index + i, count + 1)


# Time: O(n!)
# Space: O(n)
# Difficulty: medium