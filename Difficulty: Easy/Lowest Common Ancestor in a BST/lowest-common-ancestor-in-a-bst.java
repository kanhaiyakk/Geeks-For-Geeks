/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    Node LCA(Node root, Node n1, Node n2) {
        // your code here.
        if(root==null) return null;
        int curr=root.data;
        if(curr>n1.data && curr> n2.data){
            return LCA(root.left,n1,n2);
        }
        if(curr<n1.data && curr<n2.data){
            return LCA(root.right,n1,n2);
        }
        return root;
    }
}