package Queue;

public class ByArray{

    //Implementing the queue class array! with size,arr,rear for pointig last
    class QueClass{
        int arr[];
        int size;
        int rear;
        QueClass(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

    //Implementing an isEmpty if the que is empty means end will be -1
        public boolean isEmpty(){
            return rear==-1;
        }


    //Adding an element into array!
        public void add(int data){
            if(rear==size-1){
                System.out.println("Size is full of array");
                return;
            }
            arr[++rear] = data;
        }

       
    //removeing an element will make O(n) time space and also here we have to add all element int arr
        public int remove(){
            if(isEmpty()){
                return -1;
            }

            int top = arr[0];//return top element
            

            for(int i = 0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;

            return top;
        }


        public int peek(){
            if(isEmpty()){
                return -1;
            }

            return arr[0];
        }

    }    
    public static void main(String[] args) {
        QueClass que =  new ByArray().new QueClass(5);


        que.add(1);
        que.add(2);
        que.add(3);


        while(!que.isEmpty()){
            System.out.println(que.peek());
            que.remove();
        }
    }
}