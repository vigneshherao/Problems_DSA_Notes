package Stack;
import java.util.*;

public class ReverseAStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(5);
        st.push(7);

        
        Reverse(st);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }

    public static void Reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int top = st.pop();
        Reverse(st);
        PushBottom(st, top);
    }

    public static void PushBottom(Stack<Integer> st, int top) {
        if (st.isEmpty()) {
            st.push(top);
            return;
        }

        int newTop = st.pop();
        PushBottom(st, top);
        st.push(newTop);
    }
}
