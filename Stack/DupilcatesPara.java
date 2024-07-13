package Stack;
import java.util.*;

public class DupilcatesPara {
    public static void main(String[] args) {
        Stack<Character> st =  new Stack<>();
        String s = "((a+b)+(a+b))";

        System.out.println(checkDuplicates(st,s));
    }

    public static boolean checkDuplicates(Stack<Character> st , String s){
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(c==')'){
                int count = 0;
                while(st.peek()!='('){
                    st.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    st.pop();
                }
            }
            else{
                st.push(c);
            }
        }
        return false;
    }
}
