package wenxinjie;

public class leetcode58_Length_of_Last_Word {
  public int lengthOfLastWord(String s) {
        int n = s.trim().lastIndexOf(" ") + 1;
        return s.trim().length() - n;    
	}	
}
