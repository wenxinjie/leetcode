//Given an encoded string, return it's decoded string.
//
//The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
//
//You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
//
//Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
//
//Examples:
//
//s = "3[a]2[bc]", return "aaabcbc".
//s = "3[a2[c]]", return "accaccacc".
//s = "2[abc]3[cd]ef", return "abcabccdcdcdef".

package wenxinjie4;

import java.util.Stack;

public class leetcode394_Decode_String {
    public String decodeString(String s) {
        Stack<String> res = new Stack<String>();
        Stack<Integer> count = new Stack<Integer>();      
        res.push("");
        count.push(1);        
        int num = 0;        
        for (int i = 0; i < s.length() ; i ++){
            char c  = s.charAt(i);
            if (Character.isDigit(c)) num = num * 10 + (c - '0');
            else if(c == '['){
                res.push("");
                count.push(num);
                num = 0;
            }
            else if (c == ']'){                
                String a = res.pop();
                String d = "";
                int b = count.pop();     
                StringBuilder temp = new StringBuilder (res.pop());
                while (b > 0){
                    d += a;
                    b --;
                }
                temp.append(d);
                String tem = temp.toString();
                res.push(tem);
            }
            else {
                StringBuilder temp = new StringBuilder (res.pop());
                temp.append(c);
                String tem = temp.toString();
                res.push(tem);
            }
        }
        return res.pop();
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium