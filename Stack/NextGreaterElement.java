package Stack;
import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        //tc- o(n); stack in and out will be 2n + n for loop that is basically n

        int arr[] = {6,8,0,1,3};

        Stack<Integer> st = new Stack<>();
        int greaterElement[] = new int[arr.length];

        //finding greater to right
        for(int i = arr.length-1;i>=0;i--){
            //finding the greatest
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();

            }
            if(st.isEmpty()){
                greaterElement[i] = -1;
            }
            else{
                greaterElement[i] = arr[st.peek()];
            }

            st.push(i);
        }


        for(int i:greaterElement){
            System.out.println(i);
        }

    }
}
