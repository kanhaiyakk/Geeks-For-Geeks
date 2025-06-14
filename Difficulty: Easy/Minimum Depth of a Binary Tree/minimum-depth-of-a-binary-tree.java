/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    int minDepth(Node root) {
        // code here
        if(root==null) return 0;
        int lh=minDepth(root.left);
        int rh=minDepth(root.right);
        if(root.left==null || root.right==null){
            return 1+lh+rh;
        }
        return 1+Math.min(lh,rh);
    }
}