# Given an absolute path for a file (Unix-style), simplify it.

# For example,
# path = "/home/", => "/home"
# path = "/a/./b/../../c/", => "/c"

# Corner Cases:

# Did you consider the case where path = "/../"?
# In this case, you should return "/".
# Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
# In this case, you should ignore redundant slashes and return "/home/foo".


class Solution:
    def simplifyPath(self, path):
        """
        :type path: str
        :rtype: str
        """
        path = path.split("/")
        res = []
        for char in path:
            if char == "..":
                if res:
                    res.pop()
            elif char != "." and char != "":
                res.append(char)
        ans = "/"
        if len(res) == 0:
            return "/"
        else :
            return "/" + "/".join(res)

# Time: O(n)
# Space: O(n)
# Difficulty: medium