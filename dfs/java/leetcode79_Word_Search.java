//
//The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
//
//Example:
//
//board =
//[
//  ['A','B','C','E'],
//  ['S','F','C','S'],
//  ['A','D','E','E']
//]
//
//Given word = "ABCCED", return true.
//Given word = "SEE", return true.
//Given word = "ABCB", return false.



package wenxinjie1;

public class leetcode79_Word_Search {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                if (helper(i ,j, board, word)) return true;
            }
        }
        return false;
    }
    
    public boolean helper(int i, int j, char[][] board, String word){
        if (word.length() == 0) return true;
        else if(i < 0 || i >= board.length || j <0 || j >= board[0].length || board[i][j] != word.charAt(0)) return false;
        else{
            char c = board[i][j];
            board[i][j] = '0';
            boolean res = helper(i+1, j, board, word.substring(1)) || helper(i-1, j, board, word.substring(1)) || helper(i, j-1, board, word.substring(1)) || helper(i, j+1, board, word.substring(1));
            board[i][j] = c;
            return res;
        }
    }
}

//Time: O(m * n)
//Space: O(1)
//Difficulty: medium