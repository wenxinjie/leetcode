//There are a total of n courses you have to take, labeled from 0 to n-1.
//
//Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
//
//Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
//
//Example 1:
//
//Input: 2, [[1,0]] 
//Output: true
//Explanation: There are a total of 2 courses to take. 
//             To take course 1 you should have finished course 0. So it is possible.
//Example 2:
//
//Input: 2, [[1,0],[0,1]]
//Output: false
//Explanation: There are a total of 2 courses to take. 
//             To take course 1 you should have finished course 0, and to take course 0 you should
//             also have finished course 1. So it is impossible.

package wenxinjie2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode207_Course_Schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
    ArrayList[] graph = new ArrayList[numCourses];
    int[] degree = new int[numCourses];
    Queue queue = new LinkedList();
    int count=0;
    
    for(int i=0;i<numCourses;i++)
        graph[i] = new ArrayList();
        
    for(int i=0; i<prerequisites.length;i++){
        degree[prerequisites[i][1]]++;
        graph[prerequisites[i][0]].add(prerequisites[i][1]);
    }
    for(int i=0; i<degree.length;i++){
        if(degree[i] == 0){
            queue.add(i);
            count++;
        }
    }
    
    while(queue.size() != 0){
        int course = (int)queue.poll();
        for(int i=0; i<graph[course].size();i++){
            int pointer = (int)graph[course].get(i);
            degree[pointer]--;
            if(degree[pointer] == 0){
                queue.add(pointer);
                count++;
            }
        }
    }
    if(count == numCourses)
        return true;
    else    
        return false;
}
}

//Time: O(m+n)
//Space: O(n+m)
//Difficulty: medium