//Given a 2D board containing 'X' and 'O' (the letter O), capture all regions surrounded by 'X'.
//
//A region is captured by flipping all 'O's into 'X's in that surrounded region.
//
//Example:
//
//X X X X
//X O O X
//X X O X
//X O X X
//After running your function, the board should be:
//
//X X X X
//X X X X
//X X X X
//X O X X

package wenxinjie2;

import java.util.Stack;

public class leetcode130_Surrounded_Regions {
    class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    } 
    public void solve(char[][] board) {
        Stack<Point> stack = new Stack<Point>();
        if (board == null || board.length ==  0 ) return  ;
            
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n ; j ++){
                if ((i == 0 || i == m-1 || j ==0 || j == n -1 ) && board[i][j] == 'O'){
                    stack.push(new Point(i,j));
                }
            }              
        }

        while (!stack.empty()){
            Point p = stack.pop();
            int i = p.x, j = p.y;
            if (i>=0 && i <= m-1 && j >=0 && j <= n-1 && board[i][j] == 'O'){
                board[i][j] = 'A';
                stack.push(new Point(i+1,j));
                stack.push(new Point(i-1,j));
                stack.push(new Point(i,j+1));
                stack.push(new Point(i,j-1));
            }
        }
        for (int i = 0; i < m; i ++){
            for (int j = 0; j < n ; j ++){
                if (board[i][j] == 'A') board[i][j] = 'O';
                else if(board[i][j] == 'O') board[i][j] = 'X';
            }
        }
        
    }
	
}

//Time: O(m*n)
//Space: O(1)
//Difficulty: medium