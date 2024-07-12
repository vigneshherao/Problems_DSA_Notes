package Stack;
import java.util.*;
//This is very important problem 
public class StockASpan {
    public static void main(String[] args) {
        int price[] = {100,80,60,70,60,75,85};


        int span[] = new int[price.length];


        findSpan(price,span);

        for(int i :span){
            System.out.println(i);
        }
    }  

    public static void findSpan(int price[],int[] span){
        Stack<Integer> st = new Stack<>();
        span[0] = 1;
        st.push(0);

        for(int i = 1; i<span.length;i++){
            int curr = price[i];

            while(!st.empty() && curr > price[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }
            else{
                span[i] = i - st.peek();
            }
            st.push(i);
            
        }



    }
}
