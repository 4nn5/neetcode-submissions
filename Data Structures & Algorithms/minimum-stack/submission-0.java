class MinStack {

    private Deque<Integer> minStack;
    private Deque<Integer> mainStack;

    public MinStack() {
        minStack = new ArrayDeque<>();
        mainStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        mainStack.push(val);

        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {

        if(mainStack.pop().equals(minStack.peek())){ // compare object with object always
            minStack.pop();
        }
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
