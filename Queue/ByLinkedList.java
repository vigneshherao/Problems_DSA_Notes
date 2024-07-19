package Queue;

public class ByLinkedList {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public Node head;
    public  Node tail;



    public boolean isEmpty(){
        return head==null && tail==null;
    }



    public void push(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail = newNode;
        }

        tail.next = newNode;
        tail = newNode;
    }



    public int pop(){
        if(head==null){
            return -1;
        }

        if(head==tail){
            int poped = head.data;
            head = tail = null;
            return poped;
        }
        
        int poped = head.data;
        head = head.next;
        return poped;
    }



    public int peek(){
        if(head==null){
            return -1;
        }

        return head.data;
    }

    public static void main(String[] args) {
      ByLinkedList ll = new ByLinkedList();
      ll.push(1);
      ll.push(2);
      ll.push(3);



      while(!ll.isEmpty()){
        System.out.println(ll.peek());
        ll.pop();
      }


    }
}
