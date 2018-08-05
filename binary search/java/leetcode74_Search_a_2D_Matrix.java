//Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
//
//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.
//Example 1:
//
//Input:
//matrix = [
//  [1,   3,  5,  7],
//  [10, 11, 16, 20],
//  [23, 30, 34, 50]
//]
//target = 3
//Output: true


package wenxinjie1;

public class leetcode74_Search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        if (m + n <= 1) return false;
        int l = 0, r = m * n - 1;
        while (l < r){
            int mid = (l + r) / 2;
            if (matrix[ mid / n][ mid % n ] == target) return true;
            if (matrix[ mid / n][ mid % n ] > target) r = mid;
            if (matrix[ mid / n][ mid % n ] < target) l = mid + 1;
         }
        if (matrix[ l / n][ l % n ] == target) return true;
        else return false;          
    }
}

//Time:O(log(n))
//Space: O(1)
//Difficulty: medium