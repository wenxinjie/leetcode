//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//Note: For the purpose of this problem, we define empty string as valid palindrome.
//
//Example 1:
//
//Input: "A man, a plan, a canal: Panama"
//Output: true
//Example 2:
//
//Input: "race a car"
//Output: false

package wenxinjie2;

public class leetcode125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        
        if (s.isEmpty()) return true;
        
        int head = 0, tail = s.length() - 1;
        while(head < tail) {
        	// cHead = s.charAt(head);
        	// cTail = s.charAt(tail);
        	while (head < tail && !Character.isLetterOrDigit(s.charAt(head))) head++;
            while(head < tail && !Character.isLetterOrDigit(s.charAt(tail))) tail--;   	
            if (Character.toLowerCase(s.charAt(head)) != Character.toLowerCase(s.charAt(tail))) return false;        		     
            head++;
            tail--;
        }    
        return true;
    }  
}

//Time: O(n)
//Space: O(1)
//Difficulty: easy