import java.util.Stack;

class MinStack {
int min;
Stack <Integer> st;
    public MinStack() {
        min = Integer.MAX_VALUE;
        st = new Stack<>();

    }
    
    public void push(int val) {
        if(val <= min) {
            st.push(min);
            min = val;
        }

        st.push(val);
    }
    
    public void pop() {
        if(st.pop() == min) 
        min = st.pop();

    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}
