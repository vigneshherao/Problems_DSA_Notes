package LinkedList;

public class AddTwoNumbers {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node ReverseLinkedList(Node l) {
        Node prev = null;
        Node curr = l;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void Printf() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }  
    

    public Node addTwoNumbers(Node l1, Node l2) {
        l1 = ReverseLinkedList(l1);
        l2 = ReverseLinkedList(l2);
        int sum1 = 0;int sum2 = 0;
        Node temp1 = l1;
        Node temp2 = l2;
        while (temp1 != null) {  
            sum1 += sum1 * 10 + temp1.data;
            temp1 = temp1.next;
        }
        while (temp2 != null) {  
            sum2 += sum2 * 10 + temp2.data;
            temp2 = temp2.next;
        }


        return l1;

    }

    public static void main(String[] args) {
        AddTwoNumbers ll = new AddTwoNumbers();
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(2);
        ll.Printf();

    }
}
