//
//Find the total area covered by two rectilinear rectangles in a 2D plane.
//
//Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
//
//Rectangle Area
//Input: A = -3, B = 0, C = 3, D = 4, E = 0, F = -1, G = 9, H = 2
//Output: 45

package wenxinjie2;

public class leetcode223_Rectangle_Area {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {        
        int s1 = (C - A) * (D - B);
        int s2 = (G - E) * (H - F);        
        if(A >= G || B >= H || C <= E || D <= F){
            return s1 + s2;
        }        
        int length = Math.min(C, G) - Math.max(A, E);
        int height = Math.min(D, H) - Math.max(B, F);       
        return s1 + s2 - length * height;            
    }
}
//
//Time: O(1)
//Space: O(1)
//Difficulty: medium