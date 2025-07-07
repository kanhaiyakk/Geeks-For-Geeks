/*class Node of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        ArrayList<Integer> list=new ArrayList<>();
        find(root,target,list);
        return list;
    }
    public boolean find(Node node, int target,ArrayList<Integer> list){
        if(node==null) return false;
        if(node.data==target) return true;
        if(find(node.left,target,list) || find(node.right, target, list)){
            list.add(node.data);
            return true;
        }
        return false;
    }
}