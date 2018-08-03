//Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
//
//Example 1:
//
//Input: num1 = "2", num2 = "3"
//Output: "6"
//Example 2:
//
//Input: num1 = "123", num2 = "456"
//Output: "56088"


package wenxinjie;

public class leetcode43_Multiply_Strings {
    public String multiply(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        int[] num = new int[n1 + n2];
        for(int i = n1 - 1; i >= 0; i--){
            for(int j = n2 - 1; j >= 0; j--){
                int temp = (num1.charAt(i) - '0')*(num2.charAt(j) - '0');
                num[i + j] += (temp + num[i + j + 1]) / 10;
                num[i + j + 1] = (num[i + j + 1] + temp) % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i: num) if(sb.length()>0||i>0)  sb.append(i);
        return (sb.length()==0)?"0":sb.toString();
    }
}

//
//Time: O(n)
//Space: O(n)
//Difficulty: medium