// User function Template for Java

class Solution {

    public static int countNodes(Node root) {
        // Code here
        if(root==null) return 0;
        int lh=countNodes(root.left);
        int rh=countNodes(root.right);
        return 1+lh+rh;
    }
}