// User function Template for Java
class StackQueue {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public void push(int B) {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack1.push(B);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        
    }

    public int pop() {
        if(stack1.isEmpty()) {
        return -1;
    }
    return stack1.pop();
    }
}