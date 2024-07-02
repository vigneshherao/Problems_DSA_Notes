package Stack;

import java.util.ArrayList;

public class UsingArrayList {

     static class StackImplementaion{
        ArrayList<Integer> stack = new ArrayList<>();

        public boolean isEmpty(){
            if(stack.size()==0){
                return true;
            }
            return false;
        }


        public void addStackELement(int data){
            stack.add(data);
        }


        public int popStackElement(){
            if(stack.size()==0){
                return -1;
            }
            int pop = stack.size()-1;

            stack.remove(stack.size()-1);
            return pop;
        }

        public int peekStackElement(){
            return stack.get(stack.size()-1);
        }
    }
    public static void main(String[] args) {
        StackImplementaion st = new StackImplementaion();
        st.addStackELement(1);
        st.addStackELement(2);
        st.addStackELement(3);

        System.out.println(st.peekStackElement());

        while(st.stack.size()!=0){
            System.out.println(st.peekStackElement());
            st.popStackElement();
        }
    }
}
