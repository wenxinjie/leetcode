//Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.
//
//Note:
//
//If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string. For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
//All airports are represented by three capital letters (IATA code).
//You may assume all tickets form at least one valid itinerary.
//Example 1:
//
//Input: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
//Output: ["JFK", "MUC", "LHR", "SFO", "SJC"]
//Example 2:
//
//Input: [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
//Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
//Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"].
//             But it is larger in lexical order.

package wenxinjie3;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class leetcode332_Reconstruct_Itinerary {
    Map<String, PriorityQueue<String>> target = new HashMap<>();
    List<String> route = new LinkedList<String>();
    
    public List<String> findItinerary(String[][] tickets) {
        for (String[] s : tickets){
            target.computeIfAbsent(s[0], k -> new PriorityQueue()).add(s[1]);
        }
        visit("JFK");
        return route;
    }
    
    public void visit(String city){
        while (target.containsKey(city) && !target.get(city).isEmpty()){
            visit(target.get(city).poll());
        }
        route.add(0, city);
    }
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium