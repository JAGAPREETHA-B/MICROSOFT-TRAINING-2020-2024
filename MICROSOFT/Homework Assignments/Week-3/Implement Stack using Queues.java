class MyStack {
    Queue<Integer> Q1, Q2;
    public MyStack() {
        Q1 = new LinkedList<Integer>();
        Q2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        if(Q1.isEmpty()) {
           Q2.add(x);
        }
        else{
        Q1.add(x);
        }
    }
    
    public int pop() {
    int k=0;
    if(Q1.isEmpty()) {
        while(!Q2.isEmpty()) {
            k=Q2.poll();
            if(!Q2.isEmpty())
                Q1.add(k);
            }
        } 
        else{
            while(!Q1.isEmpty()) {
            k=Q1.poll();
            if(!Q1.isEmpty())
                Q2.add(k);
        }
    }
    return k;
    }
    
    public int top() {
    int k=0;
    if(Q1.isEmpty()) {
        while(!Q2.isEmpty()) {
            k=Q2.poll();
            Q1.add(k);
        }
    } 
    else{
        while(!Q1.isEmpty()) {
            k=Q1.poll();
            Q2.add(k);
        }
    }
    return k;
    }
    
    public boolean empty(){
         if(Q1.isEmpty() && Q2.isEmpty()){
         return true;
         }
         return false;
    }
}
