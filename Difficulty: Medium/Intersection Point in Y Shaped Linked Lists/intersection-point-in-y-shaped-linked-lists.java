/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Solution {
    Node intersectPoint(Node head1, Node head2) {
        // code here
        Node currA=head1;
        Node currB=head2;
        Map<Node,Integer> map=new HashMap<>();
        while(currA!=null){
            map.put(currA,map.getOrDefault(currA,0)+1);
            currA=currA.next;
        }
        while(currB!=null){
            if(map.containsKey(currB)){
                return currB;
            }
            currB=currB.next;
        }
        return null;
    }
}
