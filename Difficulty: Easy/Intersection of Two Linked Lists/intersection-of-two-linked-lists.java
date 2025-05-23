/* structure of list Node:

class Node
{
    int data;
    Node next;

    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution {
    // Function to find the intersection of two linked lists
    public Node findIntersection(Node head1, Node head2) {
        Node dummy=new Node(0);
        Node tail=dummy;
        Node currA=head1;
        Node currB=head2;
       
       Set<Integer> set=new HashSet<>();
       while(currB!=null){
           set.add(currB.data);
           currB=currB.next;
       }
       while(currA!=null){
           if(set.contains(currA.data)){
               tail.next=new Node(currA.data);
               tail=tail.next;
           }
           currA=currA.next;
       }
        
        return dummy.next;
    }
}