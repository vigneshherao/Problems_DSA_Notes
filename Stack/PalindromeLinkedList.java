package Stack;

import java.util.LinkedList;
import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        LinkedList<Character> ll = new LinkedList<>();
        ll.add('a');
        ll.add('z');
        ll.add('c');
        ll.add('b');
        ll.add('a');

        System.out.println( checkPalindrome(ll));
    }
    public static boolean checkPalindrome(LinkedList<Character>ll){
        Stack<Character> st = new Stack<>();


        for(int i = 0; i<ll.size();i++){
            st.push(ll.get(i));
        }

        for(int i = 0; i<ll.size();i++){
            if (!ll.get(i).equals(st.pop())) {
                return false;
            }
        }


        return true;
    }
}
