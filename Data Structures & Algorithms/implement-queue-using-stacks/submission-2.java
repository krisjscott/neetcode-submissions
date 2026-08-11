class MyQueue {
    private Stack<Integer> a;
    private Stack<Integer> b;

    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }
    
    public void push(int x) {
        a.push(x);
    }
    
    public int pop() {
        if(b.isEmpty()){
            while(!a.isEmpty()){
                int x = a.pop();
                b.push(x);
            }
        }
        return b.pop();
    }
    
    public int peek() {
        if(b.isEmpty()){
            while(!a.isEmpty()){
                int x = a.pop();
                b.push(x);
            }
        }
       return b.peek();
    }
    
    public boolean empty() {
        return b.isEmpty() && a.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */