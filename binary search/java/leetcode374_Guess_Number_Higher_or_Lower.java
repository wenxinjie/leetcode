//We are playing the Guess Game. The game is as follows:
//
//I pick a number from 1 to n. You have to guess which number I picked.
//
//Every time you guess wrong, I'll tell you whether the number is higher or lower.
//
//You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):
//
//-1 : My number is lower
// 1 : My number is higher
// 0 : Congrats! You got it!
//Example :
//
//Input: n = 10, pick = 6
//Output: 6

package wenxinjie4;

public class leetcode374_Guess_Number_Higher_or_Lower {
    public int guessNumber(int n) {
        int l = 1, r = n;
        while (l < r){
            int mid = (l + r) / 2;
            if (guess(mid) == 0) return mid;
            else if (guess(mid) == -1) r = mid;  
            else if (guess(mid) == 1) l = mid + 1;
        }
        return l;
    }
	
}

//Time: O(log(n))
//Space: O(1)
//Difficulty: easy

