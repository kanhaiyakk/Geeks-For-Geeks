//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        head=reverseLL(head);
        
        Node temp=head;
        int carry=1;
        while(temp!=null){
            int sum=temp.data+carry;
            temp.data=sum%10;
            carry=sum/10;
            
            if(carry==0) break;
            
            if(temp.next==null && carry==1){
                temp.next=new Node(1);
                carry=0;
                break;
            }
            temp=temp.next;
        }
        return reverseLL(head);
    }
    public static Node reverseLL(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
        
        //Recursive back tracking(Time limit exceed)
    //     int carry=helperFun(head);
    //     if(carry==1){
    //         Node newNode=new Node(1);
    //         newNode.next=head;
    //         head=newNode;
    //     }
    //     return head;
    // }
    // public static int helperFun(Node temp){
    //     if(temp==null){
    //         return 1;
    //     }
    //     int carry = helperFun(temp.next);
    //     temp.data +=carry;
    //     if(temp.data<10) return 0;
    //     temp.data=0;
    //     return 1;
    
