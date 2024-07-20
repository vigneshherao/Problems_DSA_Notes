package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

     Queue<Integer> s1 = new LinkedList<>();
   
     Queue<Integer> s2 = new LinkedList<>();


     public void push(int data){
        s1.add(data);
     }

     public int pop(){

        while(!s1.isEmpty()){
            int poped = s1.remove();
            s2.add(poped);
        }


        

     }


    public static void main(String[] args) {
        
    }
}
