class MyQueue {
    private Stack<Integer> I;
    private Stack<Integer> J;
    public MyQueue() {
        I=new Stack<>();
        J=new Stack<>();
    }
    
    public void push(int x) {
        I.push(x);
    }
    
    public int pop() {
        if(J.isEmpty()){
            while(!I.isEmpty()){
                J.push(I.pop());
            }
        }
        return J.pop();
    }
    
    public int peek() {
        if(J.isEmpty()){
            while(!I.isEmpty()){
                J.push(I.pop());
            }
        }
        return J.peek();
    }
    
    public boolean empty() {
        return I.isEmpty() && J.isEmpty();
    }
}
