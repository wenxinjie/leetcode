# Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

# Example 1:

# Input: num1 = "2", num2 = "3"
# Output: "6"
# Example 2:

# Input: num1 = "123", num2 = "456"
# Output: "56088"

class Solution(object):
    def multiply(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        n1, n2 = len(num1), len(num2)
        res = [0 for _ in range(n1+n2)]
        for i in range(n1-1, -1, -1):
            for j in range(n2-1, -1, -1):
                tem = (ord(num1[i]) - ord("0"))*(ord(num2[j]) - ord("0"))
                res[i+j] += (tem + res[i+j+1]) // 10 
                res[i+j+1] = (tem + res[i+j+1] ) % 10
        
        k, mul = 0, 10
        ans = 0
        while k < len(res):
            ans = ans * mul + res[k]
            k += 1
        if ans == 0: return "0"
        else: return str(ans)
            
# Time: O(n)
# Space: O(n)
# Difficulty: medium