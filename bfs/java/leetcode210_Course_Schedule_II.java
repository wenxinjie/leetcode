//There are a total of n courses you have to take, labeled from 0 to n-1.
//
//Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
//
//Given the total number of courses and a list of prerequisite pairs, return the ordering of courses you should take to finish all courses.
//
//There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all courses, return an empty array.
//
//Example 1:
//
//Input: 2, [[1,0]] 
//Output: [0,1]
//Explanation: There are a total of 2 courses to take. To take course 1 you should have finished   
//             course 0. So the correct course order is [0,1] .

package wenxinjie2;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode210_Course_Schedule_II {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return null;
        
        int[] degree = new int[numCourses], order = new int[numCourses];
        int index = 0;
        for (int i = 0; i < prerequisites.length; i++){
            degree[prerequisites[i][0]]++;
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++){
            if (degree[i] == 0){
                queue.offer(i);
                order[index] = i;
                index ++;
            }
        }
        
        while(!queue.isEmpty()){
            int course = queue.poll();
            for (int i = 0; i < prerequisites.length; i++){
                if (prerequisites[i][1] == course){
                    degree[prerequisites[i][0]]--;
                    if (degree[prerequisites[i][0]] == 0){
                        queue.offer(prerequisites[i][0]);
                        order[index] = prerequisites[i][0];
                        index++;
                    }
                }
            }
        }
        return (index == numCourses) ? order: new int[0];
    }
}

//Time: O(m+n)
//Space: O(m+n)
//Difficulty: medium               
