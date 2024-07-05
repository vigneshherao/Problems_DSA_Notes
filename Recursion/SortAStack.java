package Recursion;
import java.util.*;

public class SortAStack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(11);
        st.push(2);
        st.push(32);
        st.push(3);
        st.push(41);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

        st.push(11);
        st.push(2);
        st.push(32);
        st.push(3);
        st.push(41);


        


        sortStack(st);

        System.out.println("After stack sorting");

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

    }

    public static Stack<Integer> sortStack(Stack<Integer> st){
        if(st.isEmpty()){
            return st;
        }

        int topElement = st.pop();

        sortStack(st);

        sortList(st,topElement);

        return st;
    }
    

    public static void sortList(Stack<Integer> st,int num){
        if(st.isEmpty() || (!st.isEmpty() && st.peek()<=num)){
            st.push(num);
            return;
        }
        
        int add = st.pop();
        
        sortList(st,num);
        
        st.push(add);
    }
}