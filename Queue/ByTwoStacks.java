package Queue;
import java.util.Stack;


//implementing a queue using two stack - push o(n) | pop(o(1)) |

public class ByTwoStacks {

    class Queues{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();


        public boolean isEmpty(){
            return s1.isEmpty();
        }



        public void push(int data){
            
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);


            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }


        public int remove(){
            if(s1.isEmpty()){
                System.out.println("This is empty");
                return -1;
            }

            return s1.pop();
        }


        public int peek(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }



    }
    public static void main(String[] args) {
        
        ByTwoStacks outer = new ByTwoStacks();
        Queues q = outer.new Queues(); // Instantiate Queues from ByTwoStacks

        q.push(1);
        q.push(2);
        q.push(3);


        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }




        
    }
}
