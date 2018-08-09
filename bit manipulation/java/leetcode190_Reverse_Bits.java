//Reverse bits of a given 32 bits unsigned integer.
//
//Example:
//
//Input: 43261596
//Output: 964176192
//Explanation: 43261596 represented in binary as 00000010100101000001111010011100, 
//             return 964176192 represented in binary as 00111001011110000010100101000000.

package wenxinjie2;

public class leetcode190_Reverse_Bits {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i ++){
            int tem = n & 1;
            n >>= 1;
            res <<= 1 ;
            res = res | tem;           
        }
        return res;
    }
}

//Time: O(k)
//Space: O(k)
//Difficulty: easy