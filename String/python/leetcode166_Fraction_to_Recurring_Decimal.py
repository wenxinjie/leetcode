
# Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

# If the fractional part is repeating, enclose the repeating part in parentheses.

# Example 1:

# Input: numerator = 1, denominator = 2
# Output: "0.5"
# Example 2:

# Input: numerator = 2, denominator = 1
# Output: "2"
# Example 3:

# Input: numerator = 2, denominator = 3
# Output: "0.(6)"

class Solution(object):
    def fractionToDecimal(self, numerator, denominator):
        """
        :type numerator: int
        :type denominator: int
        :rtype: str
        """
        sign, ans = "-" if numerator * denominator < 0 else "", []      
        quot, remain = divmod(abs(numerator), abs(denominator))
        if not remain: return sign + str(quot)
        ans.extend([sign, str(quot), "."])
        
        dic, index, deno = {}, len(ans),  abs(denominator)
        while remain :
            if remain in dic:
                return "".join(ans[:dic[remain]]) + "(" + "".join(ans[dic[remain] : ]) + ")"

            dic[remain] = index
            tem, remain = divmod(remain * 10, deno)
            ans.append(str(tem))
            index += 1
        return "".join(ans)


# Time: O(n)
# Space: O(1)
# Difficulty: medium
