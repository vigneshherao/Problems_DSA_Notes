package LinkedList;

public class Linked {


    public class Node{

        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static  int size;


    public void addFirst(int data){
      
        Node newNode = new Node(data);
        if(head==null){
            head = tail =  newNode;
        }

        newNode.next = head;

        head = newNode;
        size++;

    }


    
    public void addLast(int data){
        
        Node newNode = new Node(data);

        if(head==null){
            head = tail =  newNode;
        }

        tail.next = newNode;

         tail = newNode;
         size++;

    }



    public void addMiddle(int data,int index){
        Node newNode = new Node(data);
        if(index==0){
            if(head.next==null){
                head=tail=newNode;
            }
            return;
        }


        Node temp;

        temp = head;
        int i = 0;

        while(i<index-1){
            temp = temp.next;
            i++;  
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }



    public static void Printf(){
        Node temp;
        
        temp = head;

        while(temp!=null){
            System.err.println(temp.data);

            temp = temp.next;
        }
        System.err.println("the size of the array is " + size);

    }


    public static void main(String[] args) {
        Linked ll = new Linked();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(5, 2);
        ll.Printf();
    }
}
