//
//Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.
//
//Note:
//The number of people is less than 1,100.
//
//
//Example
//
//Input:
//[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
//
//Output:
//[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]

package wenxinjie4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class leetcode406_Queue_Reconstruction_by_Height {
    public int[][] reconstructQueue(int[][] people) {
    	
//    sort	
        Arrays.sort(people, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if (b[0] == a[0]) return a[1] - b[1];
                return b[0] - a[0];
            }});
        
        int n = people.length;
        ArrayList<int[]> tem = new ArrayList<>();
        
// 	  insert        
        for (int i = 0; i < n; i++){
            tem.add(people[i][1], new int[]{people[i][0], people[i][1]});
        }

        
        int[][] res = new int[people.length][2];
        int i = 0;
        for (int[] k : tem){
            res[i][0] = k[0];
            res[i][1] = k[1];
            i ++;
        }
        return res;
    }
}


//Time: O(nlogn)
//Space: O(n)
//Difficulty: medium 

