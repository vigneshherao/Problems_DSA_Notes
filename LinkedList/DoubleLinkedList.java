public class DoubleLinkedList {

    class Node{
        Node prev;
        Node next;
        int data;

        public Node(int data){
            this.data = data;
        }
    }

    public static Node head;
    public static Node tail;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail= newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void addLastNode(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public void removeFirstNode(){
        if(head==null){
            System.out.println("There is no node to delete");
            return;
        }

        if (head == tail) { 
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

    }

    public void removeLastNode(){
        if(head==null){
            System.out.println("There is no node to delete");
            return;
        }

        if (head == tail) { 
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void Reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void printNode(Node head){
        Node temp = head;
        System.out.println("null");
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.addNode(1);
        dl.addNode(0);
        dl.addLastNode(2);
        dl.printNode(head);
        dl.Reverse();
        dl.printNode(head);
       

    }
}
