//A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
//
//Return a deep copy of the list.

package wenxinjie2;

import java.util.HashMap;

public class leetcode138_Copy_List_with_Random_Pointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) return null;
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode clonehead = new RandomListNode(head.label);
        RandomListNode clonecur = clonehead, cur = head;
        while (cur != null){
            if (cur.next != null){
                if (map.containsKey(cur.next)) clonecur.next = map.get(cur.next);
                else{
                    RandomListNode tem = new RandomListNode(cur.next.label);
                    clonecur.next = tem;
                    map.put(cur.next, clonecur.next);
                }
            }
            if (cur.random != null){
                if (map.containsKey(cur.random)) clonecur.random = map.get(cur.random);
                else{
                    RandomListNode tem1 = new RandomListNode(cur.random.label);
                    clonecur.random = tem1;
                    map.put(cur.random, clonecur.random);
                }
            }
            cur = cur.next;
            clonecur = clonecur.next;
        }
        return clonehead;
    }
    
    
    public RandomListNode copyRandomList1(RandomListNode head) {
        if(head == null) return null;
        RandomListNode h = head;
        while (h != null){
            RandomListNode cur = new RandomListNode(h.label);
            cur.next = h.next;
            h.next = cur;
            h = cur.next;
        }
        h = head;
        while (h != null){
            if (h.random!= null) h.next.random = h.random.next;
            h = h.next.next;
        }
        h = head;
        RandomListNode head1 = new RandomListNode(0);
        RandomListNode newhead = head1;
        while (h != null){
            newhead.next = h.next;
            newhead = newhead.next;
            RandomListNode t = h.next.next;
            h.next = t;
            h = h.next;              
        }
        return head1.next;
    }   
}

//Time: O(n)
//Space: O(n)
//Difficulty: medium