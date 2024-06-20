package LinkedList;

public class Create {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


     //Adding new node in the first

    public void addNode(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

        newNode.next = head;

        head = newNode;

    }

    //Adding new node in the last

    public void addNodeLast(int data){
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;

        tail = newNode;
    
        
    }


    //Iterating over nodes

    
    public void PrintNode(){
        Node temp = head;
        
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Create c1 = new Create();
        c1.addNode(2);
        c1.addNode(1);
    
        c1.addNodeLast(3);
        c1.addNodeLast(4);


        c1.PrintNode();


    }
}
