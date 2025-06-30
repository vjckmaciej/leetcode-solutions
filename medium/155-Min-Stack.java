class MinStack {
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> supportStack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        mainStack.push(val);
        if (supportStack.isEmpty() || val <= supportStack.peek()) {
            supportStack.push(val);
        }
    }
    
    public void pop() {
        int removed = mainStack.pop();
        if (removed == supportStack.peek()) {
            supportStack.pop();
        }
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return supportStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */