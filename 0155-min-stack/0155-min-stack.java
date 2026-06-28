class MinStack {
    Stack<Integer> st;
    Stack<Integer> MinSt;
    public MinStack() {
        st = new Stack<>();
        MinSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(MinSt.isEmpty()){
            MinSt.push(val);
        }
        else{
            if(val<=MinSt.peek()){
                MinSt.push(val);
            }
        }
    }
    
    public void pop() {
        if (st.peek().equals(MinSt.peek())) {
            MinSt.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return MinSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */