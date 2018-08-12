//Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.
//
//Example 1:
//
//Input: n = 12
//Output: 3 
//Explanation: 12 = 4 + 4 + 4.
//Example 2:
//
//Input: n = 13
//Output: 2
//Explanation: 13 = 4 + 9.

package wenxinjie3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode279_Perfect_Squares {
    public int numSquares(int n) {
        class Node{
            public int value;
            public int cnt;
            public Node(int value, int cnt){
                this.value = value;
                this.cnt = cnt;
            }
        }
        
        if (n < 0) return 0;
        if (n == 1) return 1;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i <= Math.sqrt(n); i++){
            map.put(i * i, 1);
        }
        
        int[] visited = new int[n+1];
        visited[0] = 1;
        Queue<Node> queue = new LinkedList<Node>();
        Node root = new Node(0,0);
        queue.offer(root);
        while (!queue.isEmpty()){
            Node node = queue.poll();           
            for (int i: map.keySet()){
                if (node.value + i == n) return node.cnt + 1;
                else if (node.value + i < n){
                    if (visited[node.value + i] == 0){
                        visited[node.value + i] = 1;
                        queue.offer(new Node(node.value + i, node.cnt + 1));
                    }
                }           
            }
        }        
      return 0;  
    }
}

//Time: O(log(n)
//Space: O(n)
//Difficulty: medium 
