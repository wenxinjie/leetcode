//According to the Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
//
//Given a board with m by n cells, each cell has an initial state live (1) or dead (0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
//
//Any live cell with fewer than two live neighbors dies, as if caused by under-population.
//Any live cell with two or three live neighbors lives on to the next generation.
//Any live cell with more than three live neighbors dies, as if by over-population..
//Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
//Write a function to compute the next state (after one update) of the board given its current state. The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously.
//
//Example:
//
//Input: 
//[
//  [0,1,0],
//  [0,0,1],
//  [1,1,1],
//  [0,0,0]
//]
//Output: 
//[
//  [0,0,0],
//  [1,0,1],
//  [0,1,1],
//  [0,1,0]
//]

package wenxinjie3;

public class leetcode289_Game_of_Life {
    public void gameOfLife(int[][] board) {
        if (board.length == 0) return ;
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                int live = count(i,j, board);
                if ((board[i][j] == 1) && (live == 2 || live == 3)) board[i][j] = 3;
                if ((board[i][j] == 0) && (live == 3)) board[i][j] = 2;
            }
        }
        
        for (int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                board[i][j] >>= 1; 
            }
        }
    }
    
    public int count(int x, int y, int[][] board){
        int live = 0;
        for (int i = Math.max(0, x-1); i < Math.min(x+2, board.length); i ++){
            for (int j = Math.max(0, y-1); j < Math.min(y+2, board[0].length); j ++){
                live += board[i][j]&1; 
            }
        }
        live -= board[x][y] & 1;
        return live;
    }
}

//Time: O(n^2)
//Space: O(1)
//Difficulty: medium
