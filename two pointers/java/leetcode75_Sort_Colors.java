//Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.
//
//Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
//
//Note: You are not suppose to use the library's sort function for this problem.
//
//Example:
//
//Input: [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]

package wenxinjie1;

public class leetcode75_Sort_Colors {
    public void sortColors(int[] nums) {
        int n = nums.length, tem, tem1;
        int p0 = 0, p1 = 0, p2 = n - 1;
        while (p1 <= p2){
            if (nums[p1] == 1) p1+=1;
            else if (nums[p1] == 2){
                tem = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = tem;
                p2-=1;
            }
            else if (nums[p1] == 0){
                tem1 = nums[p1];
                nums[p1] = nums[p0];
                nums[p0] = tem1;
                p0+=1;
                p1+=1;
            }   
        }
    }
}

//Time: O(nlog(n))
//Space: O(1)
//Difficulty: medium