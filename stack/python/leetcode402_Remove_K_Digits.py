# Given a non-negative integer num represented as a string, remove k digits from the number so that the new number is the smallest possible.

# Note:
# The length of num is less than 10002 and will be ≥ k.
# The given num does not contain any leading zero.
# Example 1:

# Input: num = "1432219", k = 3
# Output: "1219"
# Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
# Example 2:

# Input: num = "10200", k = 1
# Output: "200"
# Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes

class Solution(object):
    def removeKdigits(self, num, k):
        """
        :type num: str
        :type k: int
        :rtype: str
        """
        while k > 0:
            k -= 1
            i = 0
            while i < len(num) - 1:
                if num[i] > num[i + 1]:
                    break
                i += 1
            num = num[:i] + num[i+1:]
        
        return str(int(num)) if num else "0"


    def removeKdigits2(self, num, k):
    	stack = []
    	for i in num:
    		if stack and stack[-1] > i and k:
    			stack.pop()
    			k -= 1
    		stack.append(i)

    	while stack and k:
    		k -= 1
    		stack.pop()

    	while stack and stack[0] == "0":
    		stack.pop(0)
    	return "".join(stack) if stack else "0"  


# Time: O(n * k)
# Space: O(n)
# Difficulty: medium     