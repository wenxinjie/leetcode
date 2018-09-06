//Given an integer, write an algorithm to convert it to hexadecimal. For negative integer, two’s complement method is used.
//
//Note:
//
//All letters in hexadecimal (a-f) must be in lowercase.
//The hexadecimal string must not contain extra leading 0s. If the number is zero, it is represented by a single zero character '0'; otherwise, the first character in the hexadecimal string will not be the zero character.
//The given number is guaranteed to fit within the range of a 32-bit signed integer.
//You must not use any method provided by the library which converts/formats the number to hex directly.
//Example 1:
//
//Input:
//26
//
//Output:
//"1a"
	
package wenxinjie4;

public class leetcode405_Convert_a_Number_to_Hexadecimal {
    public String toHex(int num) {
        if (num == 0) return "0";
        
        String dic = "0123456789abcdef";
        String res = "";
        for (int i = 0; i < 8; i ++){
            int n = num & 15;
            String c = dic.substring(n, n + 1);
            res = c + res;
            num >>= 4;
        }
        int i = 0;
        while (res.charAt(i) == '0'){
            i ++;
        }
        return res.substring(i, res.length());
    }
}

//Time: O(1)
//Space: O(1)
//Difficulty: easy