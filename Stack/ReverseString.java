package Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";

        Stack<Character> st = new Stack<>();


        for(int i = 0; i<s.length();i++){
            st.push(s.charAt(i));
        }



        StringBuilder newString = new StringBuilder();


        while (!st.isEmpty()) {
            char sub = st.pop();
            newString.append(sub);
        }


        System.out.println(newString.toString());
    }
}
