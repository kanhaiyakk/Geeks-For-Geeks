class Solution {
    // Function to reverse the queue.
    public Queue<Integer> reverseQueue(Queue<Integer> queue) {
        Queue<Integer> result=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.poll());
            
        }
        while(!stack.isEmpty()){
            result.offer(stack.pop());
        }
        return result;
    }
}