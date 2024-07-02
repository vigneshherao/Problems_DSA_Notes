package Stack;

import java.util.Stack;

//here we can use the recursion for the stack to push the element to bottm
//first we need to pop the last element of stack add into varibale
//call recursion till stack size == 0 if 0 then push element to bottom 
//then recursvely add the poped element to stack;



public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();
        st.push(1); st.push(2); st.push(3);
        
        System.out.println("Original stack:");
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

        st.push(1); st.push(2); st.push(3); // Re-add elements to stack
        
        addBottom(st, 4);

        System.out.println("\nStack after adding 4 at bottom:");
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }

    public static void addBottom(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        
        int top = st.pop();
        addBottom(st, x);
        st.push(top);
    }
}
