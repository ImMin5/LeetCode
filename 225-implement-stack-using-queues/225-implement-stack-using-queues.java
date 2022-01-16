class MyStack {
    static int[] stack;
    static int top;
    public MyStack() {
        top = -1;
        this.stack = new int[100];
    }
    
    public void push(int x) {
        this.stack[++top] = x;
    }
    
    public int pop() {
        return stack[top--];
    }
    
    public int top() {
        return stack[top];
    }
    
    public boolean empty() {
        if(top == -1) 
            return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */