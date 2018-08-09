# Reverse bits of a given 32 bits unsigned integer.

# Example:

# Input: 43261596
# Output: 964176192
# Explanation: 43261596 represented in binary as 00000010100101000001111010011100, 
#              return 964176192 represented in binary as 00111001011110000010100101000000.


class Solution:
    # @param n, an integer
    # @return an integer
    def reverseBits(self, n):
        n = bin(n)[2:]
        n = (32 - len(n)) * "0" + n
        n.rstrip("0")
        return int(n[::-1], 2)

    def reverseBits2(self, n):
    	res = 0
        for i in range(32):
            tem = n & 1
            n >>= 1
            res <<= 1
            res = res | tem
        return res
        

# Time: O(k)
# Space: O(k)
# Difficulty: easy