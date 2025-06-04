/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG {
    // Function to store the zig zag order traversal of tree in a list.
    ArrayList<Integer> zigZagTraversal(Node root) {
        // Add your code here.
        ArrayList<Integer> result=new ArrayList<>();
        if(root==null) return result;
        Queue<Node> queue=new LinkedList<>();
        boolean leftToRight=true;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> list=new ArrayList<>(size);
            
            for(int i=0;i<size;i++){
                Node curr=queue.poll();
                if(leftToRight){
                    list.add(curr.data); //adding at last
                }else{
                    list.add(0,curr.data); //add at the starting
                }
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            result.addAll(list);
            leftToRight= !leftToRight; //flipping the direction
        }
        return result;
    }
}