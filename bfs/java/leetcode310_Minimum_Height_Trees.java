//For a undirected graph with tree characteristics, we can choose any node as the root. The result graph is then a rooted tree. Among all possible rooted trees, those with minimum height are called minimum height trees (MHTs). Given such a graph, write a function to find all the MHTs and return a list of their root labels.
//
//Format
//The graph contains n nodes which are labeled from 0 to n - 1. You will be given the number n and a list of undirected edges (each edge is a pair of labels).
//
//You can assume that no duplicate edges will appear in edges. Since all edges are undirected, [0, 1] is the same as [1, 0] and thus will not appear together in edges.
//
//Example 1 :
//
//Input: n = 4, edges = [[1, 0], [1, 2], [1, 3]]
//
//        0
//        |
//        1
//       / \
//      2   3 
//
//Output: [1]

package wenxinjie3;

import java.util.ArrayList;
import java.util.List;

public class leetcode310_Minimum_Height_Trees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<Integer>();
        if (edges.length == 0){
            if (n == 1){
                res.add(0);
            }
            return res;
        }
        
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        
    
        for (int i = 0; i < n; i++) {
            if (graph[i].size() == 1) {
                res.add(i);
            }
        }
        
        while (n > 2){
            n = n - res.size();
            List<Integer> newleaves = new ArrayList<Integer>();
            for (int leaf : res){
                int tem = graph[leaf].get(0);
                graph[tem].remove(Integer.valueOf(leaf));
                if (graph[tem].size() == 1){
                    newleaves.add(tem);
                }
            }
            res = newleaves;
        }
        return res;
    }
}

//Time: O(n) 
//Space: O(n)
//Difficulty: medium
