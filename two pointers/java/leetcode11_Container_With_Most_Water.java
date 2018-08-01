//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//
//Note: You may not slant the container and n is at least 2.
package wenxinjie;

public class leetcode11_Container_With_Most_Water {
	public int maxArea(int[] height) {
        int n = height.length;
        int p1 = 0;
        int p2 = n-1;
        int maxarea = 0;
        while (p2 > p1){
            int area = (p2 - p1) * Math.min(height[p2], height[p1]);
            if (area > maxarea){
                maxarea = area;
                if (height[p2] < height[p1] )  p2 --;
                else p1 ++;
            }
            else{
                if (height[p2] < height[p1] )  p2 --;
                else p1 ++;
            }            
        }
        return maxarea;    
    }

}

//Time: O(n)
//Space: O(1)
//Difficulty: medium