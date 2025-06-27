class MinStack {

    public MinStack() {
        
    }

      Stack<Long> st = new Stack<>();
    long min = Integer.MAX_VALUE;
    
    public void push(int val) {

          if (st.isEmpty()) {

            min = val;
            st.push((long) val);
        } else {

            if (val > min) st.push((long)val);
            else {
                st.push(2L * val - min);
                min = val;
            }
        }
        
    }
    
    public void pop() {

         if (st.isEmpty()) {

            System.out.println(" stack is empty ");
            return;

        }

        long top = st.peek();
        st.pop();

        if (top < min) {

            min = 2 * min - top;

        }
        
    }
    
    public int top() {

         if(st.isEmpty()){
            return -1;
        }

        long top=st.peek();

        if(min < top) return (int) top;

        return (int) min;

        
    }
    
    public int getMin() {

         return (int) min;
        
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